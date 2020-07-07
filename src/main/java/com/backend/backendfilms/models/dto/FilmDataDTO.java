package com.backend.backendfilms.models.dto;

import com.backend.backendfilms.models.domain.FilmActors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.Date;
import java.util.List;


@Data
@JsonIgnoreProperties
public class FilmDataDTO {
    private String title;
    @JsonProperty("episode_id")
    private Integer episodeId;
    @JsonProperty("opening_crawl")
    private String openingCrawl;
    private String director;
    private String producer;
    @JsonProperty("release_date")
    private Date releaseDate;
    private List species;
    private List starships;
    private List vehicles;
    private List characters;
    private List planets;
    private String url;
    private String created;
    private String edited;

    private List<FilmActors> actors;

}
