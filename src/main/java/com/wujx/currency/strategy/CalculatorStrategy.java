package com.wujx.currency.strategy;

@FunctionalInterface
public interface CalculatorStrategy {
    public double calculate(double salary,double bonus);
}
