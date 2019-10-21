package com.wujx.currency.chapter6;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 17:52
 */
public class ThreadCloseGraceful {

    private static class Worker extends Thread{
         private volatile boolean start =true;

        @Override
        public void run() {
            while (start) {


            }
        }
        public void shutdown(){
         this.start=false;

        }
    }

    public static void main(String[] args)  {
        Worker worker=new Worker();
        worker.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.shutdown();
    }
}
