package com.my.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        System.out.println("1.1 使用匿名内部类根据 name 排序 players");
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        List<String> list=Arrays.asList(players);
        System.out.println("排序结果：");
        list.forEach(System.out::println);
    }
}
