package com.example.exercises;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise5 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	private static final BiConsumer<String, Optional<ContinentPopulatedCity>> print= (k, v) -> {
		final Consumer<ContinentPopulatedCity> continentPopulatedCityConsumer = cpc -> out.println(cpc.getKey() + ": " + v.get().getValue());
		v.ifPresent(continentPopulatedCityConsumer);
	};
	
	public static void main(String[] args) {
		// Find the highest populated capital city of each continent
        final Map<String, Optional<ContinentPopulatedCity>> continentsCapitals = 
       		  countryDao.findAllCountries()
		                .stream()
		                .filter(country -> country.getCapital() > 0)
		                .map(ContinentPopulatedCity::newContinentPopulatedCity)
		                .collect(groupingBy(ContinentPopulatedCity::getKey, maxBy(comparing(cpc -> cpc.getValue().getPopulation()))));
        continentsCapitals.forEach(print);
	}

}

class ContinentPopulatedCity implements Map.Entry<String, City> {
	private static final CityDao cityDao = InMemoryWorldDao.getInstance();
    private String continent;
    private City city;
    
    static ContinentPopulatedCity newContinentPopulatedCity(Country country) {
    	return new ContinentPopulatedCity(country.getContinent(), cityDao.findCityById(country.getCapital()));
    }
    
    public ContinentPopulatedCity(String continent, City city) {
        this.continent = continent;
        this.city = city;
    }

    @Override    public String getKey() {
        return continent;
    }

    @Override    public City getValue() {
        return city;
    }

    @Override    public City setValue(City city) {
        this.city = city;
        return city;
    }

}