package org.example.Task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = GetStudents();
        for (Student student: students) {
            if (student.name.endsWith("on")){
                int sum = 0;
                for (Integer ball: student.balls) {
                    sum += ball;
                }
                if(sum%2 ==0)
                    System.out.println(student.salary);
            }
        }
        System.out.println("Unique list of the students: " + uniqueList(students));
    }

    private static Collection uniqueList(List<Student> studentList) {
        return new HashSet(studentList);
    }


    public static List<Student> GetStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
//        students.add(new Student("Name1", 1, 100, Arrays.asList(10,20,30)));
//        students.add(new Student("Name2on", 2, 101, Arrays.asList(11,21,31)));
//        students.add(new Student("Name2on", 2, 101, Arrays.asList(11,21,31)));
//        students.add(new Student("Name2on", 2, 101, Arrays.asList(11,21,31)));
//        students.add(new Student("Name3", 3, 102, Arrays.asList(12,22,32)));
//        students.add(new Student("Name4on", 4, 103, Arrays.asList(13,23,33)));
//        students.add(new Student("Name5on", 5, 104, Arrays.asList(14,24,34)));
        return students;

    }
}

