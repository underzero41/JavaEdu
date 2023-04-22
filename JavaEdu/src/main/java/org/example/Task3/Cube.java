package org.example.Task3;

public class Cube {
    Double size;
    String color;
    String material;
    public Cube(Double size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public  double getVolume(){
        return size * size * size;
    }
}
