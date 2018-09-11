package com.my.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author jiaruifeng
 * @create 2018-09-03 下午4:22
 * @desc
 **/

public class FunctionTest {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);


        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        System.out.println("输出所有数据:");
        eval(list,n->true);




        System.out.println("输出全部偶数");
        eval(list,n->n%2==0);
        System.out.println("输出大于3的数");
        eval(list,n->n>3);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
