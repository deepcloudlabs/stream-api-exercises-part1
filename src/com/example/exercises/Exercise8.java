package com.example.exercises;

import java.util.stream.Collectors;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise8 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Group the movies by the year and list them
		var moviesByYear =
		movieService.findAllMovies().stream()
		            .collect(Collectors.groupingBy(Movie::getYear));
		moviesByYear.forEach((year,movies) -> System.out.printf("%d: %s\n",year,movies));
	}

}
