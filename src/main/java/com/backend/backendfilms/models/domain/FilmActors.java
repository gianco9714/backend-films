package com.backend.backendfilms.models.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties
public class FilmActors implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
}
