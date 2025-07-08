package com.autobots.java.lamdba.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);

        List<String> nonNestedList = new ArrayList<>();
        for (List<String> list : nestedList){
            nonNestedList.addAll(list);

        }
        System.out.println(nonNestedList);
        System.out.println("________________________________");

        List<String> list = nestedList.stream().flatMap(List -> List.stream()).toList();
        System.out.println(list);
        System.out.println("________________________________");

        List<String> nonNestedWithStrim = nestedList.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        System.out.println(nonNestedWithStrim);
    }
}
