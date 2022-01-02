package com.example.util;

import java.util.DoubleSummaryStatistics;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class DoubleSummaryGaussianStatistics extends DoubleSummaryStatistics {
    private double variance;
    private double stdVariance;
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
            Mk += difference/getCount();
            Qk += ((getCount()-1)*difference*difference)/getCount();
        }
    }

    @Override
    public void combine(DoubleSummaryStatistics other) {
        super.combine(other);
    }

    public double getVariance() {
        variance= Qk / (getCount() - 1);
        return variance;
    }

    public double getStdVariance() {
        stdVariance= Math.sqrt (Qk/getCount());
        return stdVariance;
    }

    @Override
    public String toString() {
        return "DoubleSummaryGaussianStatistics{" +
                "variance=" + getVariance() +
                ", stdVariance=" + getStdVariance() +
                "}\n"+super.toString();
    }
}