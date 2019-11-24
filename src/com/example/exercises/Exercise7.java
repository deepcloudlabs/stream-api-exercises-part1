package com.example.exercises;

import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise7 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	private static final Predicate<Movie> drama = movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Drama"));
	private static final Predicate<Movie> comedy = movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Comedy"));
	private static final Predicate<Movie> havingTwoGenresOnly = movie -> movie.getGenres().size() == 2;

	public static void main(String[] args) {
		// Find the list of movies having the genres "Drama" and "Comedy" only
        final Collection<Movie> movies = movieService.findAllMovies();
        List<Movie> dramaAndComedyMovies = movies.stream()
                .filter(havingTwoGenresOnly.and(drama.and(comedy)))
                .collect(toList());
        dramaAndComedyMovies.forEach(movie -> out.println(format("%-32s: %12s", movie.getTitle(), movie.getGenres().stream().map(Genre::getName).collect(joining(",")))));
	}

}
