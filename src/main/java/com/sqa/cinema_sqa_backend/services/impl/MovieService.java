package com.sqa.cinema_sqa_backend.services.impl;

import com.sqa.cinema_sqa_backend.dtos.MovieDTO;
import com.sqa.cinema_sqa_backend.entities.Movie;
import com.sqa.cinema_sqa_backend.form.CreatingMovieForm;
import com.sqa.cinema_sqa_backend.form.UpdatingMovieForm;
import com.sqa.cinema_sqa_backend.repositories.IMovieRepository;
import com.sqa.cinema_sqa_backend.services.IMovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<MovieDTO> findAllMovies() {
        return movieRepository.findAll().stream()
                .map(movie -> modelMapper.map(movie, MovieDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public MovieDTO getById(Integer id) {
        return modelMapper.map(movieRepository.getById(id),MovieDTO.class);
    }

    @Override
    public List<MovieDTO> findAllShowingMoviesByName(String keyword) {
        return movieRepository.findAllByNameContaining(keyword)
                .stream().map(movie -> modelMapper.map(movie,MovieDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<MovieDTO> findMoviesByCategories(String categories) {
        return null;
    }

    @Override
    public void createMovie(CreatingMovieForm movie) {
        movieRepository.save(modelMapper.map(movie, Movie.class));
    }

    @Override
    public void deleteMovies(List<Integer> ids) {
        for (Integer id: ids){
            movieRepository.delete(modelMapper.map(getById(id),Movie.class));
        }
    }

    @Override
    public void updateMovie(UpdatingMovieForm movie, Integer id) {
        movie.setId(id);
        movieRepository.save(modelMapper.map(movie,Movie.class));
    }


}
