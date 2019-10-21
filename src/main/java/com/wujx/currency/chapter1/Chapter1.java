package com.wujx.currency.chapter1;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/18 0018 9:34
 */
public class Chapter1 {

    public static void main(String[] args) {
         new Thread("READ-Thread" ){
             @Override
             public void run() {
                 println(Thread.currentThread().getName());
                 readFromDataBase();
             }
         }.start();
        new Thread("WRITE-Thread" ){
            @Override
            public void run() {
                writeDtatoFile();
            }
        }.start();




//        Thread t1=new Thread("Custom-Thread"){
//            @Override
//            public void run(){
//                for (int i = 0; i <100 ; i++) {
//                    println("Take 1=>"+i);
//
//                }
//            }
//        };
//        t1.start();
//
//        for (int j = 0; j <100 ; j++) {
//            println("Take 2=>"+j);
//
//        }
    }

   private  static void readFromDataBase()  {
               //read data from database and handle it

       try {
           println("Begin write data from db ");
           Thread.sleep(1000*10L);
           println("Read data done and start handle it");
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("The data handle finish and successfully");

   }
   private static void writeDtatoFile(){

       try {
           println("Begin write data to file ");
           Thread.sleep(2000*10L);
           println("Write data done and start handle it");
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("The write handle finish and successfully");

   }
   private static void println(String message){

       System.out.println(message);
   }


}
