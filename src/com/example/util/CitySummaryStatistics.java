package com.example.util;

import java.util.Comparator;
import java.util.function.Consumer;

import com.example.domain.City;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class CitySummaryStatistics implements Consumer<City> {
    private Comparator<City> comparator;
    private City min;
    private City max;
    private long count;

    public CitySummaryStatistics() {
    }

    public CitySummaryStatistics(Comparator<City> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void accept(City city) {
        count ++;
        min = min!=null && comparator.compare(min,city)<=0 ? min : city;
        max = max!=null && comparator.compare(max,city)>=0 ? max : city;
    }

    public void combine(CitySummaryStatistics other) {
        this.min= comparator.compare(this.min,other.min)<=0 ? this.min : other.min;
        this.max= comparator.compare(this.max,other.max)>=0 ? this.max : other.max;
    }

    public City getMin() {
        return min;
    }

    public void setMin(City min) {
        this.min = min;
    }

    public City getMax() {
        return max;
    }

    public void setMax(City max) {
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
        return "CitySummaryStatistics{" +
                "min=" + getMin() +
                ", max=" + getMax() +
                ", count=" + getCount() +
                '}';
    }

}
