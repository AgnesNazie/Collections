package com.agnes.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();

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

    public static void exe4() {
        ArrayList<String> week = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("=============================EXERCISE4===========================");
        System.out.println(week);
        ArrayList<String> firstThree = new ArrayList<> (week.subList(0, 3));
        System.out.println(firstThree);

    }
}