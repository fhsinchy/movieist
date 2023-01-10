package dev.farhan.movieist;

import dev.farhan.movieist.movies.Movie;
import dev.farhan.movieist.movies.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@RestController
public class MovieistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieistApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@Bean
	CommandLineRunner runner(MovieRepository repository) {
		return args -> {
			Movie movie = new Movie(
					"Moshari",
					"Nushash Humayun",
					2022,
					"https://www.youtube.com/watch?v=85Hd-4JCJ3I",
					List.of("Horror", "Short"),
					List.of("Sunerah Binte Kamal", "Nairah Onora Saif"),
					LocalDateTime.now(), LocalDateTime.now()
			);

			repository.insert(movie);
		};
	}
}
