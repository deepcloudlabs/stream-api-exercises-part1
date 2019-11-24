package com.example.exercises;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.function.BinaryOperator.maxBy;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

import java.util.Map;
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

	private static final BiConsumer<String,Optional<Country>> printEntry =
			(continent,country) -> out.println(format("%s: %s",continent,country.get()));
			
	public static void main(String[] args) {
		// Find the richest country of each continent with respect to their GNP (Gross National Product) values.
        final Map<String, Optional<Country>> richestCountryByContinent =
          worldDao.findAllCountries()
                .stream()
                .collect(
                    groupingBy(Country::getContinent,
                    reducing(maxBy(comparing(Country::getGnp))))
                );
        richestCountryByContinent.forEach(printEntry);
	}

}
