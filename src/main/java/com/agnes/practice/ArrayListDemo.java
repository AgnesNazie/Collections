package com.agnes.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        exe1();
        exe2();

        exe3();

    }

    public static void exe1() {
        ArrayList<String> daysOfTheWeek = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        System.out.println(daysOfTheWeek);
        System.out.println("===================EXERCISE 2=================");


    }

    public static void exe2() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        for (String day : days) {
            System.out.println(day);

        }

    }

    public static void exe3() {
        ArrayList<String> daysOf = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"));
        daysOf.add(3, "Thursday");
        System.out.println("===================EXERCISE3=========================");
        System.out.println(daysOf);
    }
}