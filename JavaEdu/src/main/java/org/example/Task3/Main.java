package org.example.Task3;

import java.util.List;
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Cube> cubes = getCubes();
        int amountYellow = 0;
        double volumeYellow = 0;
        int amountWood = 0;
        for (Cube cube: cubes) {
            if(cube.color.equals("yellow")){
                amountYellow += 1;
                volumeYellow += cube.getVolume();
            }
            if (cube.material.equals("wood")){
                amountWood =+ 1;
            }
        }
        System.out.println(amountYellow);
        System.out.println(volumeYellow);
        System.out.println(amountWood);
    }
    public static ArrayList<Cube> getCubes(){
        ArrayList<Cube> cubes = new ArrayList<Cube>();
        cubes.add(new Cube(2.0, "red", "wood"));
        cubes.add(new Cube(3.0, "green", "paper"));
        cubes.add(new Cube(4.0, "blue", "steel"));
        cubes.add(new Cube(5.0, "yellow", "paper"));
        cubes.add(new Cube(6.0, "white", "steel"));
        cubes.add(new Cube(7.0, "black", "wood"));
        return cubes;
    }
}
