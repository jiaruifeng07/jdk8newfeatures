package com.my.lambda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LambdaForRunnable {
    public static void main(String[] args) throws InterruptedException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" "+dateFormat.format(new Date()));
                }
            }
        }).start();
        while(true){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" "+dateFormat.format(new Date()));

        }

    }
}
