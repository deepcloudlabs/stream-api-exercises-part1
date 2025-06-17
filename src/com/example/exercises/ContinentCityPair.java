package com.example.exercises;

import java.util.Optional;

import com.example.domain.City;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public record ContinentCityPair(String continent,City city) implements Comparable<ContinentCityPair>{

	@Override
	public int compareTo(ContinentCityPair other) {
		return this.city.getPopulation()-other.city.getPopulation();
	}

	public static void printEntry(String continent,Optional<ContinentCityPair> pair) {
		pair.ifPresent(_pair -> System.out.printf("%s: %s\n",continent,_pair.city()));
	}

}
