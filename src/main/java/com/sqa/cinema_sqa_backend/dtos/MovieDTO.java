package com.sqa.cinema_sqa_backend.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieDTO {
    private int id;
    private String name;
    private String categories;
    private LocalDate releaseDate;
    private int duration;
}
