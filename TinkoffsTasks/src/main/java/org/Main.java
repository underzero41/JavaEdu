package org;
import java.lang.Math;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите данные: ");
        int N = scanner.nextInt();
        if (1 <= N && N <=2*Math.pow(10,9)){
            if(N%2==0){
                result = N>>1;
            }
            else result = N/2+1;
            System.out.println(result);
        }
        scanner.close();
    }
}
