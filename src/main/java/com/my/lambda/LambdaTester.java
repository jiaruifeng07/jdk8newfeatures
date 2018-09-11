package com.my.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaruifeng
 * @create 2018-09-03 上午11:33
 * @desc
 **/

public class LambdaTester {
    interface MathOperation<T>{
        T operate(T a,T b);
    }

    interface GreetingService{
        void greeting(String message);
    }


    public static void main(String[] args) {
        int aa=100;
        MathOperation<Integer> addOperation=((a, b) -> a+b);
        System.out.println(addOperation.operate(1,2));
        MathOperation<Integer> subOperation=((a, b) -> a-b);
        System.out.println(subOperation.operate(1,2));
        //aa=2220;
        MathOperation<Integer> modifyOperation=((a, b) -> a+=aa);
        //aa=2220;
        System.out.println(subOperation.operate(1,2));
        GreetingService greetingService1=(message -> System.out.println("hello "+message));
        greetingService1.greeting("java");
        GreetingService greetingService2=message -> System.out.println("hello "+message);
        greetingService2.greeting("world");
    }
}
