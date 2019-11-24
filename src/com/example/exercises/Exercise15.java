package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise15 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final ToIntFunction<Country> compareByCitiyNumber = country -> country.getCities().size();
	private static final Consumer<Country> printCountry = country -> System.err.println(country.getName()+": "+country.getCities().size());
	private static final BiConsumer<String,List<Country>> printEntry = (continent,countries) -> {
		System.err.println(continent);
		System.err.println("_______________");
		countries.forEach(printCountry);
		System.err.println("\n");
	};

	public static void main(String[] args) {
		// Group the countries by continent, and then sort the countries in each continent by number of cities in each country.
		Map<String,List<Country>> countriesByContinent = countryDao.findAllCountries()
                  .stream()
                  .sorted(Comparator.comparingInt(compareByCitiyNumber ).reversed())
                  .collect(Collectors.groupingBy(Country::getContinent));
		countriesByContinent.forEach(printEntry);
	}

}
