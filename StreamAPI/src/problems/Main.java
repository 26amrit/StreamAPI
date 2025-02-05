package problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //duplicates from list
        List<Integer> integerList = new ArrayList<>(List.of(1, 4, 8, 13, 4, 15, 19, 15));

        System.out.println(integerList.stream().distinct().collect(Collectors.toList()));

        System.out.println(integerList.stream().filter(i -> Collections.frequency(integerList, i) > 1).collect(Collectors.toSet()));


        //ThreeMaxMin
        List<Integer> integers = new ArrayList<>(List.of(45, 12, 56, 15, 24, 75, 31, 89));


        System.out.println("Three Min " + integers.stream().sorted().limit(3).toList());


        System.out.println("Three Max: " + integers.stream().sorted(Comparator.reverseOrder()).limit(3).toList());

        //Second Largest from Array

        Integer[] arr = new Integer[]{43, 56, 53, 53, 65};

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        // Employee class

        List<Employee> employees = Employee.Data.getEmployeeList();

        System.out.println(employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).skip(1).findFirst().get());

        System.out.println(employees.stream().filter(e -> e.getGender().equals("Female")).count());
        System.out.println(employees.stream().filter(e -> e.getGender().equals("Male")).count());
        System.out.println(employees.stream().collect(Collectors.partitioningBy(e -> e.getGender().equals("Female"))));

        //System.out.println(employees.stream().map(Employee::designation).collect(Collectors.));

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::designation,Collectors.counting())));

    }


}
