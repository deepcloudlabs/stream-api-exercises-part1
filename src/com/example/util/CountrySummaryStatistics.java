package com.example.util;

import java.util.Comparator;
import java.util.function.Consumer;

import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class CountrySummaryStatistics implements Consumer<Country> {
	private Comparator<Country> comparator;
	private Country min;
	private Country max;
	private long count;

	public CountrySummaryStatistics() {
	}

	public CountrySummaryStatistics(Comparator<Country> comparator) {
		this.comparator = comparator;
	}

	@Override
	public void accept(Country value) {
		count++;
		min = min != null && comparator.compare(min, value) <= 0 ? min : value;
		max = max != null && comparator.compare(max, value) >= 0 ? max : value;
	}

	public void combine(CountrySummaryStatistics other) {
		this.min = comparator.compare(this.min, other.min) <= 0 ? this.min : other.min;
		this.max = comparator.compare(this.max, other.max) >= 0 ? this.max : other.max;
	}

	public Country getMin() {
		return min;
	}

	public void setMin(Country min) {
		this.min = min;
	}

	public Country getMax() {
		return max;
	}

	public void setMax(Country max) {
		this.max = max;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CountrySummaryStatistics{" + "min=" + getMin() + ", max=" + getMax() + ", count=" + getCount() + '}';
	}

}