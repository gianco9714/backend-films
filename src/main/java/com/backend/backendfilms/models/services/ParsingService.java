package com.backend.backendfilms.models.services;

import com.backend.backendfilms.models.domain.FilmActors;
import com.backend.backendfilms.models.domain.FilmData;
import com.backend.backendfilms.models.domain.Films;
import com.backend.backendfilms.models.dto.FilmDataDTO;

public interface ParsingService {
    Films parse(String url);

    FilmData urlFindById(String url);

    FilmActors getActors(String url);
}
