package com.wujx.currency.chapter8;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 14:09
 */
public class OtherService {

    private final Object lock = new Object();

    private DeadLock deadLock;


    public void s1() {
        synchronized (lock){
            System.out.println("s1==============");
        }
    }
    public void s2() {
        synchronized (lock){
            System.out.println("s2==============");
            deadLock.m2();
        }
    }


    public DeadLock getDeadLock() {
        return deadLock;
    }

    public void setDeadLock(DeadLock deadLock) {
        this.deadLock = deadLock;
    }
}
