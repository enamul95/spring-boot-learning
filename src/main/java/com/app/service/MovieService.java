package com.app.service;


import java.util.List;

import com.app.entity.Movie;
import com.app.repo.MovieRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie found for the id "+id));
    }

    public Movie updateMovie(Movie movie, Long id) {
        Movie existingMovie = movieRepository.findById(id).get();
        existingMovie.setGenera(movie.getGenera());
        existingMovie.setName(movie.getName());
        existingMovie.setReleaseDate(movie.getReleaseDate());
        return movieRepository.save(existingMovie);
    }

    public void deleteMovie(Long id) {
        Movie existingMovie = movieRepository.findById(id).get();
        movieRepository.delete(existingMovie);

    }
}






