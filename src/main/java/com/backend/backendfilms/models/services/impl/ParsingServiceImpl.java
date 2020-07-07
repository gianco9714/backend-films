package com.backend.backendfilms.models.services.impl;

import com.backend.backendfilms.models.domain.FilmActors;
import com.backend.backendfilms.models.domain.FilmData;
import com.backend.backendfilms.models.domain.Films;
import com.backend.backendfilms.models.services.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ParsingServiceImpl implements ParsingService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Films parse(String url) {
        return restTemplate.getForObject(url, Films.class);
    }

    @Override
    public FilmData urlFindById(String url) {
        return restTemplate.getForObject(url, FilmData.class);
//        FilmData filmData =  restTemplate.getForObject(url, FilmData.class);
//
//        List<FilmActors> actoresList = new ArrayList<>();
//        for ( Object map : filmData.getCharacters()){
//            FilmActors actors = new FilmActors();
//            System.out.println(removeLastChar(map.toString()));
//            String a = restTemplate.getForObject(removeLastChar(map.toString()), String.class);
//
//            actors.setName(a);
//            actoresList.add(actors);
//        }
//        filmData.setActors(actoresList);
//
//        return filmData;
    }

    @Override
    public FilmActors getActors(String url) {
        return restTemplate.getForObject(url, FilmActors.class);
    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

}
