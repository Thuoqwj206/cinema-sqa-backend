package com.sqa.cinema_sqa_backend.services;


import com.sqa.cinema_sqa_backend.dtos.MovieDTO;
import com.sqa.cinema_sqa_backend.form.CreatingMovieForm;
import com.sqa.cinema_sqa_backend.form.UpdatingMovieForm;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> findAllMovies();
    MovieDTO getById(Integer id);
    List<MovieDTO> findAllShowingMoviesByName(String name);
    List<MovieDTO> findMoviesByCategories(String categories);
    void createMovie(CreatingMovieForm movie);
    void deleteMovies(List<Integer> ids);
    void updateMovie(UpdatingMovieForm movie, Integer id);
}
