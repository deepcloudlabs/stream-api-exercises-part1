package com.example.util;

import java.util.DoubleSummaryStatistics;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class DoubleSummaryGaussianStatistics extends DoubleSummaryStatistics {
    private double Mk;
    private double Qk;

    @Override
    public void accept(double value) {
        super.accept(value);
        if (1 == getCount()) {
            Mk = value;
            Qk = 0.;
        } else {
            double difference = value - Mk;
            Mk += difference / getCount();
            Qk += ((getCount() - 1) * difference * difference) / getCount();
        }
    }

    @Override
    public void combine(DoubleSummaryStatistics other) {
        super.combine(other);
    }

    public double getVariance() {
        return Qk / (getCount() - 1);
    }

    public double getStdVariance() {
        return Math.sqrt(Qk / getCount());
    }

    @Override
    public String toString() {
        return "DoubleSummaryGaussianStatistics{" +
                "variance=" + getVariance() +
                ", stdVariance=" + getStdVariance() +
                "}\n" + super.toString();
    }
}