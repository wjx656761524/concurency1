package com.wujx.currency.chapter8;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/21 0021 14:43
 */
public class DeadLockTest {

    public static void main(String[] args) {

        OtherService otherService=new OtherService();

        DeadLock deadLock=new DeadLock(otherService);

        otherService.setDeadLock(deadLock);

        new Thread(){
            @Override
            public void run() {
                while(true){
                    deadLock.m1();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    otherService.s2();
                }
            }
        }.start();

    }
}
