package org.Task0;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        int result = 0;
        System.out.println("Введите данные: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        if(array[0] < 1) {
            System.out.println("Абонентская плата не может быть такой дешевой, введите правильное значение.");
        }
        if (array[3] > 100) {
            System.out.println("Вы используете слишком много мегабайт, попробуйте другой тариф.");
        }
        else if (array[3] > array[1]){
            result = (array[3] - array[1]) * array[2] + array[0];
        }
        else if(array[3] <= array[1]){
            result = array[0];
        }
        System.out.println(result);
        scanner.close();
    }
}
