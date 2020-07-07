package com.backend.backendfilms.controllers;

import com.backend.backendfilms.models.domain.FilmActors;
import com.backend.backendfilms.models.domain.FilmData;
import com.backend.backendfilms.models.domain.Films;
import com.backend.backendfilms.models.services.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class FilmController {

    private static final String MAIN_PAGE = "main";
    private static final String JSON_FILMS_URL = "https://swapi.dev/api/films/";

    @Autowired
    private ParsingService parsingService;

    @GetMapping("/api/films")
    public Films getFilms(){
        Films films = parsingService.parse(JSON_FILMS_URL);
        return films;
    }

    @GetMapping("/api/films/{id}")
    public FilmData getFilmsById(@PathVariable Long id){
        FilmData filmData = parsingService.urlFindById(JSON_FILMS_URL + id +"/");
        filmData.getCharacters();
        return filmData;
    }

}
