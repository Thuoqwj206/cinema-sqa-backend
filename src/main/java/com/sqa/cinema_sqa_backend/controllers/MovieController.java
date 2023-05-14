package com.sqa.cinema_sqa_backend.controllers;
import com.sqa.cinema_sqa_backend.dtos.MovieDTO;
import com.sqa.cinema_sqa_backend.entities.Movie;
import com.sqa.cinema_sqa_backend.repositories.IMovieRepository;
import com.sqa.cinema_sqa_backend.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    IMovieService movieService ;

    @Autowired
    private IMovieRepository movieRepository;

    @GetMapping("/showing")
    List<MovieDTO> getAllShowingMovies(){
       return movieService.findAllMovies();
    }

    @GetMapping("/details")
    MovieDTO getMovieById(@RequestParam Integer id){
        return movieService.getById(id);
    }

    @GetMapping("/showing/search")
    public List<MovieDTO> findAllShowingMoviesByName(@RequestParam String name){
        return movieService.findAllShowingMoviesByName(name);
    }

    @PostMapping
    public void updateMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
    }
}
