package org.Task1;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите данные: ");
        int N = scanner.nextInt();
        if (1 <= N && N <= pow(10,9)){
            if(N%2==0){
                result = N>>1;
            }
            else result = N/2+1;
            System.out.println(pow(10,9));
            System.out.println(result);
        }
        scanner.close();

    }
    public static int pow(int value, int powValue){
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
