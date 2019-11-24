package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise6 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final Comparator<Country> sortByNumOfCities = comparing(country -> country.getCities().size());
	private static final Predicate<Country> countriesHavingNoCities = country -> country.getCities().isEmpty();

	public static void main(String[] args) {
		// Sort the countries by number of their cities in descending order
        List<Country> countries = countryDao.findAllCountries()
                .stream()
                .filter(countriesHavingNoCities.negate())
                .sorted(sortByNumOfCities.reversed())
                .collect(toList());
        countries.forEach(country -> out.println(format("%38s %3d", country.getName(), country.getCities().size())));
	}

}
