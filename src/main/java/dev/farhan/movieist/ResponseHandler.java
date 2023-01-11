package dev.farhan.movieist;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(Object responseObj, HttpStatus httpStatus) {

        String status;
        Map<String, Object> map = new HashMap<String, Object>();

        if (httpStatus.value() == 500) {
            status = "error";
        } else if (httpStatus.value() == 400) {
            status = "fail";
        } else {
            status = "success";
        }

        map.put("status", status);
        map.put("data", responseObj);

        return new ResponseEntity<Object>(map, httpStatus);
    }
}
