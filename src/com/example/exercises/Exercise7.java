package com.example.exercises;

import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

import java.util.HashSet;
import java.util.List;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise7 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        // Find the list of movies having the genres "Drama" and "Comedy" only
        var listOfGenreNames = List.of("Drama", "Comedy");
        var listOfGenres = listOfGenreNames.stream().map(movieService::findGenreByName).toList();
        var moviesInDramaAndComedyOnly =
                movieService.findAllMovies()
                        .stream()
                        .filter(movie -> movie.getGenres().size() == 2)
                        .filter(movie -> new HashSet<>(listOfGenres).containsAll(movie.getGenres()))
                        .toList();
        moviesInDramaAndComedyOnly.forEach(movie -> System.out.printf("%s %s\n", movie, movie.getGenres()));
    }

}
