package com.wujx.currency.strategy;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 10:12
 */
public class TaxCalculatorMain {
    public static void main(String[] args) {

        TaxCalaculator calaculator=new TaxCalaculator(10000d,2000d,(s,b)->  s * 0.1 + b * 0.15);
        System.out.println(calaculator.calculate());
    }
}
