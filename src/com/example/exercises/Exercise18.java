package com.example.exercises;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise18 {
	private static final  MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the year where the maximum number of movie is available
        Collection<Movie> movies = movieService.findAllMovies();
        final Optional<Map.Entry<Integer,Long>> maxMovieCountByYear = movies.stream().collect(Collectors.groupingBy(Movie::getYear,Collectors.counting()))
        		.entrySet().stream().max(Map.Entry.comparingByValue());
        maxMovieCountByYear.ifPresent(System.out::println);
	}

}
