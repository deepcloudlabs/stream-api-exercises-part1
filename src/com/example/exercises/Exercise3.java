package com.example.exercises;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.example.domain.Director;
import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise3 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of genres of each director's movies
		final Collection<Movie> movies = movieService.findAllMovies();
		final Map<Director, Map<Genre, Long>> directorGenreList = movies.stream()
				.map(movie -> movie.getDirectors().stream()
						           .map(director -> new DirectorGenres(director, movie.getGenres())).collect(toList()))
				.flatMap(Collection::stream)
				.map(directorGenres -> directorGenres.getValue().stream()
						                           .map(genre -> new DirectorGenre(directorGenres.getKey(), genre)).collect(toList()))
				.flatMap(Collection::stream)
				.collect(groupingBy(DirectorGenre::getKey,groupingBy(DirectorGenre::getValue,counting())));

		directorGenreList.forEach((k1, v1) -> {
			System.out.println(k1.getName());
			v1.forEach((k2, v2) -> {
				System.out.println(String.format("\t%-12s: %2d", k2.getName(), v2));
			});
			System.out.println();
		});
	}

}

class DirectorGenres implements Map.Entry<Director, List<Genre>> {
	private Director director;
	private List<Genre> genres;

	public DirectorGenres(Director director, List<Genre> genres) {
		this.director = director;
		this.genres = genres;
	}

	@Override
	public Director getKey() {
		return director;
	}

	@Override
	public List<Genre> getValue() {
		return genres;
	}

	@Override
	public List<Genre> setValue(List<Genre> genres) {
		this.genres = genres;
		return genres;
	}

}

class DirectorGenre implements Map.Entry<Director, Genre> {
	private Director director;
	private Genre genre;

	public DirectorGenre(Director director, Genre genre) {
		this.director = director;
		this.genre = genre;
	}

	@Override
	public Director getKey() {
		return director;
	}

	@Override
	public Genre getValue() {
		return genre;
	}

	@Override
	public Genre setValue(Genre genre) {
		this.genre= genre;
		return genre;
	}

}
