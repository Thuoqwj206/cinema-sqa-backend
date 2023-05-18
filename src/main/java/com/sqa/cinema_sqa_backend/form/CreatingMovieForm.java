package com.sqa.cinema_sqa_backend.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CreatingMovieForm {
    @NotBlank(message = "Movie name cannot be null")
    private String name;
    private String categories;
    private LocalDate releaseDate;
    private int duration;
}
