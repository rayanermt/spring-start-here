package learnspring.c10ex1rest.controller;

import learnspring.c10ex1rest.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/brazil")
    public ResponseEntity<Country> brazil() {
        Country brazil = Country.of("Brazil", 50);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "South America")
                .header("capital", "Brasilia")
                .header("language", "Portuguese")
                .body(brazil);
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("Spain", 42);
        Country c2 = Country.of("Japan", 55);

        // List objects can't be modified.
        return List.of(c1, c2);
    }
}
