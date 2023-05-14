package com.sqa.cinema_sqa_backend.services;


import com.sqa.cinema_sqa_backend.dtos.MovieDTO;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> findAllMovies();
    MovieDTO getById(Integer id);
    List<MovieDTO> findAllShowingMoviesByName(String name);
}
