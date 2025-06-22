package com.example.exercises;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;

import java.util.LongSummaryStatistics;
import java.util.function.BiConsumer;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingLong;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise12 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final BiConsumer<String, LongSummaryStatistics> printEntry = (continent, statistics) -> System.out.printf("%s: %s\n", continent, statistics);

    public static void main(String[] args) {
        // Find the minimum, the maximum and the average population of each continent.
        var populationSummaryByContinent =
                worldDao.findAllCountries()
                        .stream()
                        .collect(groupingBy(Country::getContinent, summarizingLong(Country::getPopulation)));
        populationSummaryByContinent.forEach(printEntry);
    }

}
