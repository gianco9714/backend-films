package com.backend.backendfilms.models.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
@Data
@JsonIgnoreProperties
public class Films {

    private String next;
    private String previous;
    private Integer count;
    private List<FilmData> results;

}
