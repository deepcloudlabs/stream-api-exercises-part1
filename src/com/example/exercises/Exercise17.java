package com.example.exercises;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;
import com.example.util.DoubleSummaryGaussianStatistics;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise17 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the minimum, the maximum, the average, and the standard deviation of GNP values.
        var gnpStatistics =
           worldDao.findAllCountries()
                   .stream()
                   .mapToDouble(Country::getGnp)
                   .collect(
                           DoubleSummaryGaussianStatistics::new,
                           DoubleSummaryGaussianStatistics::accept,
                           DoubleSummaryGaussianStatistics::combine
                   );
        System.out.println(gnpStatistics);
	}

}
