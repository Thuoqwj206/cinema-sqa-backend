package com.sqa.cinema_sqa_backend.repositories;

import com.sqa.cinema_sqa_backend.dtos.MovieDTO;
import com.sqa.cinema_sqa_backend.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMovieRepository extends JpaRepository<Movie,Integer> {
    List<Movie> findAllByNameContaining(String name);
    List<Movie> findAllByCategoriesContaining(String categories);
}
