package org.example.Task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = fillMap();
        System.out.println(concerned("CLX", map));


    }

    private static Integer concerned(String str, Map<Character, Integer> map) {
        Integer result = map.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length()-1; i++) {
            if(map.get(str.charAt(i)) < map.get((str.charAt(i+1)))){
                result -= map.get(str.charAt(i));
            }
            else{
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }


    public static Map<Character, Integer> fillMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
