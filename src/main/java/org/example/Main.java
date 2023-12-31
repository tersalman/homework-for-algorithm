package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IntegerList b = new IntegerListIm(7);
        b.add(1);
        b.add(3);
        b.add(1,4);
        b.add(5);
        b.add(6);

        /*
     creating
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            int n = (int) Math.random();
            arr[i] = n;
        }

        int[] arr2 = Arrays.copyOf(arr, 100000);
        int[] arr3 = Arrays.copyOf(arr, 100000);

testing
        long start = System.currentTimeMillis();
        IntegerListIm.bubble(arr);
        System.out.println(System.currentTimeMillis() - start);

        long start1 = System.currentTimeMillis();
        IntegerListIm.bubble(arr2);
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();
        IntegerListIm.bubble(arr3);
        System.out.println(System.currentTimeMillis() - start);

        */



        System.out.println(b.contains(4));
    }
}