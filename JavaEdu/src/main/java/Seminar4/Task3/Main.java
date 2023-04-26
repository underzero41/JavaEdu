package Seminar4.Task3;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1, -2, -3, 4, 5, -6, -7, 8, -9));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i -= 1;
            }
            System.out.println(list);
        }
    }
}
