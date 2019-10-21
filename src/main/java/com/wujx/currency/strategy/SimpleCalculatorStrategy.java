package com.wujx.currency.strategy;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 10:13
 */
public class SimpleCalculatorStrategy implements CalculatorStrategy {
    private  final static  double SAlLARY_RATE=0.1;
    private  final static  double BONUS_RATE=0.15;



    public double calculate(double salary, double bonus) {
        return salary * SAlLARY_RATE +bonus *  BONUS_RATE;
    }
}
