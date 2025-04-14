package com.agnes.practice;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();
        exe5();
        exe6();
        exe7();
        exe8();
        exe9();
        exe10();
        //exe11();
        //exe12();
        //exe13();
        //exe14();

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
        System.out.println("=============================EXERCISE 4===========================");
        System.out.println("ORIGINAL LIST");
        System.out.println(week);
        ArrayList<String> firstThree = new ArrayList<>(week.subList(0, 3));
        System.out.println("SUBLIST");
        System.out.println(firstThree);

    }

    public static void exe5() {
        HashSet<String> days = new LinkedHashSet<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("=============================EXERCISE 5===========================");
        System.out.println(days);

    }

    public static void exe6() {
        HashSet<String> days = new LinkedHashSet<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("=============================EXERCISE 6===========================");
        System.out.println("ORIGINAL HASHSET");
        System.out.println(days);
        ArrayList<String> dayList = new ArrayList<>(days);
        System.out.println("Convert Hashset to ArrayList");
        System.out.println(dayList);

    }

    public static void exe7() {
        HashSet<String> names = new LinkedHashSet<>(Arrays.asList("Agnes", "Fidelis", "Javan", "Nazie", "Mehrdad", "Fuche", "Che", "Edwin"));
        System.out.println("==================EXERCISE7============================");
        System.out.println("ORIGINAL HASHSET" + names);
        ArrayList<String> nameList = new ArrayList<>(names);
        System.out.println("Converted Hashset to ArrayList" + nameList);
        Collections.sort(nameList);
        System.out.println("Sorted Name List" + nameList);
    }

    public static void exe8() {
        Set<String> firstNames = new TreeSet<>(Arrays.asList("Nazie", "Ngong", "Che", "Javan","Agnes"));
        System.out.println("=================EXERCISE8=========================");
        System.out.println(firstNames);
    }
    public static void exe9() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "BMW");
        cars.put(3, "Toyota");
        cars.put(4, "Avensis");
        cars.put(2, "Volvo");
        System.out.println("===================EXERCISE9======================");
        System.out.println(cars);
    }
    public static void exe10(){
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "BMW");
        cars.put(3, "Toyota");
        cars.put(4, "Avensis");
        cars.put(2, "Volvo");
        System.out.println("===================EXERCISE10======================");
        System.out.println(cars.keySet());
    }
}