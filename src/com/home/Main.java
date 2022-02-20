package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of array elements");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        arrayPrint(array);
        arraySort(array);
        arrayPrint(array);
    }

    public static void arraySort(int array[]) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }


    public static void arrayPrint(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}

