package days.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableSample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Amal", 24));
        list.add(new Student("Kamal", 22));
        list.add(new Student("Nimal", 23));
        Collections.sort(list);

        System.out.println(list);
    }
}

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }
        if(this.age == o.age){
            return 0;
        }
        else return -1;
    }
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age > o2.age){
            return 1;
        }
        if(o1.age == o2.age){
            return 0;
        }
        return -1;
    }
}