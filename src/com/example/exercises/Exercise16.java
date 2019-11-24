package com.example.exercises;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;
import com.example.util.CountryCitySummaryStatistics;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise16 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	private static final BiConsumer<CountryCitySummaryStatistics, Country> accumulator = (s, c) -> s.accept(c);
	private static final BinaryOperator<CountryCitySummaryStatistics> combiner = (l, r) -> {
		l.combine(r);
		return l;
	};
	private static final BiConsumer<String, CountryCitySummaryStatistics> printEntry = (country,
			statistics) -> System.out.println(String.format("%s: %s", country, statistics));

	public static void main(String[] args) {
		// Find the cities with the minimum and the maximum population in countries.

		final Map<String, CountryCitySummaryStatistics> countryCityStatistics = worldDao.findAllCountries().stream()
				.collect(Collectors.groupingBy(Country::getCode,
						Collector.of(CountryCitySummaryStatistics::new, accumulator, combiner)));
		countryCityStatistics.forEach(printEntry);
	}

}
