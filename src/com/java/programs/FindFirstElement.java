package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10,20,28,25,75,5,27,18,19,75,20,56,10,83,29,70);
        myList1.stream().findFirst().ifPresent(System.out::println);
    }
}
