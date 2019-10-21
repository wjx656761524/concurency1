package com.wujx.currency.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 13:54
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(() ->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));

        });
        Thread t2=new Thread(() ->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join(100,10);
        Optional.of("All of tasks finsih done .").ifPresent(System.out::println);
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
    }
}
