package com.wujx.currency.chapter1;

/**
 * @description:
 * @author: Wujx
 * @time: 2019/10/19 0019 9:07
 */
public class TemplateMethod {


    public final void print(String message){
        System.out.println("##########################");

       wrapPrint(message);
        System.out.println("##########################");


    }
    protected void wrapPrint(String message){



    }

    public static void main(String[] args) {
        TemplateMethod t1=new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };
        t1.print("Hello Thread");


    }
}
