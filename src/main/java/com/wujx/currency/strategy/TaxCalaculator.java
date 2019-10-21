package com.wujx.currency.strategy;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 10:03
 */
public class TaxCalaculator {
    private double salary;

    private  double bonus;

    private CalculatorStrategy calculatorStrategy;



    public TaxCalaculator(double salary, double bonus, CalculatorStrategy calculatorStrategy) {
        this.salary = salary;
        this.bonus = bonus;
        this.calculatorStrategy = calculatorStrategy;
    }

    protected double calcTax(){
        return calculatorStrategy.calculate(salary,bonus);
    }
    public double calculate(){
       return this.calcTax();

    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
