package com.homework12;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamOperations {
    public static void main(String[] args) {

        //Task1
        List<Integer> numbers = List.of(1, 2, 5, 4, 10);
        System.out.println(numbers);

        System.out.println("Average: " + average(numbers));

        //Task2
        List<String> str = List.of("one", "two", "three", "four");
        System.out.println(toUpper(str));

        //Task3=============================================
        System.out.println();
        List<String> listStr = List.of("Green", "Grey", "orange", "blue", "Black", "white", "Red", "pink");
        listStr.stream()
                .filter(e -> e.contains(e.toLowerCase()) && e.length() == 4)
                .collect(Collectors.toList());
        System.out.println("Filter: " + filter(listStr));
    }

    public static double average(List<Integer> n) {
        return n.stream().mapToDouble(e -> e).average().getAsDouble();

    }

    public static Map<String, String> toUpper(List<String> s) {
        Map<String, String> map = s.stream()
                .collect(Collectors.toMap(i -> i, i -> i.toUpperCase()));
        return map;
    }

    public static List<String> filter(Collection<String> s) {
        List<String> list = s.stream()
                .filter(e -> e.contains(e.toLowerCase()) && e.length() == 4)
                .collect(Collectors.toList());
        return list;

    }

}
