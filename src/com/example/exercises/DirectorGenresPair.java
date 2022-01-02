package com.example.exercises;

import java.util.List;

import com.example.domain.Director;
import com.example.domain.Genre;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
record DirectorGenresPair(Director director,List<Genre> genres) { }
