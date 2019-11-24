package com.example.exercises;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise2 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	private static final BiConsumer<String, Optional<City>> printEntry =
			(k,v) -> {
				City city = v.get();
				System.out.println(k + ": City [ name= " + city.getName() + ", population= " + city.getPopulation() + " ]");
			};

	public static void main(String[] args) {
		// Find the most populated city of each continent
        final Map<String, Optional<City>> highPopulatedCitiesByContinent = 
        		  countryDao.findAllCountries()
			                .stream()
			                .map( country -> country.getCities().stream().map(city -> new ContinentCity(country.getContinent(),city) ).collect(Collectors.toList()) )
			                .flatMap(Collection::stream)
			                .collect(Collectors.groupingBy(ContinentCity::getKey,mapping(ContinentCity::getValue, maxBy(comparing(City::getPopulation)))));
        highPopulatedCitiesByContinent.forEach(printEntry);
	}

}

class ContinentCity implements Map.Entry<String, City> {
	private String continent;
	private City city;
	
	public ContinentCity(String continent, City city) {
		this.continent = continent;
		this.city = city;
	}

	@Override
	public String getKey() {
		return continent;
	}

	@Override
	public City getValue() {
		return city;
	}

	@Override
	public City setValue(City city) {
		this.city = city;
		return city;
	}
}