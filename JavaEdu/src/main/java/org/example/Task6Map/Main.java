package org.example.Task6Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = fillArray();
        System.out.println(arrayList);
        System.out.println(test(arrayList));
    }

    private static ArrayList<Integer> fillArray() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(i);
        }
        return result;
    }

    private static boolean test(ArrayList arrayList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            map.putIfAbsent((Integer) arrayList.get(i), 0);
            map.putIfAbsent((Integer) arrayList.get(i), map.get(arrayList.get(i)) + 1);
            if (map.get(arrayList.get(i)) > 1) {
                return false;
            }
        }
        return true;
    }
}
