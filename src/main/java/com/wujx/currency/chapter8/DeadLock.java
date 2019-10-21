package com.wujx.currency.chapter8;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 14:09
 */
public class DeadLock {

    private final Object lock = new Object();

    private OtherService otherService;

    public DeadLock() {
    }

    public DeadLock(OtherService otherService){

        this.otherService=otherService;
    }

    public void m1() {
        synchronized (lock) {
            System.out.println("m1");
             otherService.s1();

        }


    }
    public void m2() {
        synchronized (lock) {
            System.out.println("m2");

        }


    }



}
