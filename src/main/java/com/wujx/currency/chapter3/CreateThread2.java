package com.wujx.currency.chapter3;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 11:12
 */
public class CreateThread2 {



    private static int counter=0;

    private byte[] bytes=new byte[1024];
    //JVM will create a thread named "main"
    public static void main(String[] args) {
        Thread t1=new Thread(null,()->{
            try {
                add(0);
            } catch (Error e) {
                e.printStackTrace();
                System.out.println(counter);
            }
        },"Test",1<<24);
        t1.start();

        //create a jvm stack
    }
    public  static  void add(int i){
        ++counter;
        add(i+1);
    }
}
