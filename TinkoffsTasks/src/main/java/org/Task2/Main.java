package org.Task2;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[2];
        int[] array2 = new int[5];
        int result = 0;
        System.out.println("Введите данные: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println(array1);
        System.out.println(array2);
    }
}