package com.wujx.currency.chapter7;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 13:54
 */
public class SychronizedStaticTest {

    public static void main(String[] args) {
        new Thread("T1"){
            @Override
            public void run() {
                SynchronizedStatic.m1();
            }
        }.start();
        new Thread("T2"){
            @Override
            public void run() {
                SynchronizedStatic.m2();
            }
        }.start();
        new Thread("T3"){
            @Override
            public void run() {
                SynchronizedStatic.m3();
            }
        }.start();
    }
}
