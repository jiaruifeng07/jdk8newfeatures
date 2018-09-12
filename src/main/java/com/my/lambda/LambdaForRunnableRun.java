package com.my.lambda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LambdaForRunnableRun {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + dateFormat.format(new Date()));
            }
        }
        ).run();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + dateFormat.format(new Date()));

        }
    }
}
