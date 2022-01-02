package com.example.exercises;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Optional;
import java.util.function.BiConsumer;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise10 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();
	private static final BiConsumer<String,Optional<Country>> printEntry = (continent,country) -> System.out.printf("%s: %s\n",continent,country.get());		
	public static void main(String[] args) {
		// Find the richest country of each continent with respect to their GNP (Gross National Product) values.
        var richestCountryByContinent =
                worldDao.findAllCountries()
                      .stream()
                      .collect(groupingBy(Country::getContinent,maxBy(comparing(Country::getGnp))));
        richestCountryByContinent.forEach(printEntry);
	}

}
