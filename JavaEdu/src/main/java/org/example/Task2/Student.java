package org.example.Task2;

import java.util.List;

public class Student {
    String name;
    Integer number;
    double salary;
    List<Integer> balls;

    public Student(String name, Integer number, double salary, List<Integer> balls) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.balls = balls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.salary, salary) != 0) return false;
        if (!name.equals(student.name)) return false;
        if (!number.equals(student.number)) return false;
        return balls.equals(student.balls);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + number.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + balls.hashCode();
        return result;
    }
}
