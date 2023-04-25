package Seminar4.Task1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,25,45,65,32,454,575,242));
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 == 0){
                sum += list.get(i);
            }
        }
        System.out.println(sum);
    }
}
