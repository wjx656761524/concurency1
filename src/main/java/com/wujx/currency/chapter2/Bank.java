package com.wujx.currency.chapter2;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:38
 */
public class Bank {
    public static void main(String[] args) {
        TocketWindow tocketWindow1=new TocketWindow("1号柜台");
        tocketWindow1.start();
        TocketWindow tocketWindow2=new TocketWindow("2号柜台");
        tocketWindow2.start();
        TocketWindow tocketWindow3=new TocketWindow("3号柜台");
        tocketWindow3.start();

    }
}
