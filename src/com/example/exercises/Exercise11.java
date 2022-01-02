package com.example.exercises;

import static java.util.stream.Collectors.summarizingLong;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise11 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the minimum, the maximum and the average population of world countries
		var populationSummary = 
		worldDao.findAllCountries()
		        .stream()
				.collect(summarizingLong(Country::getPopulation));
		System.out.println(populationSummary);
	}

}
