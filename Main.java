package com.homework.daniel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        printArray(createArray(10));

    }
    static int[] createArray(int length){
        Random rnd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;

    }
    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ", ");
        }
    }
}
