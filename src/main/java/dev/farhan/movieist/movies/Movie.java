package dev.farhan.movieist.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String title;
    private String director;
    private int releaseYear;
    private String trailerLink;
    private List<String> genre;
    private List<String> notableCast;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Movie(String title, String director, int releaseYear, String trailerLink, List<String> genre, List<String> notableCast, LocalDateTime created, LocalDateTime updated) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.trailerLink = trailerLink;
        this.genre = genre;
        this.notableCast = notableCast;
        this.created = created;
        this.updated = updated;
    }
}
