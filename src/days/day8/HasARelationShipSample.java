package days.day8;

import java.util.ArrayList;

public class HasARelationShipSample {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        Subject s2 = new Subject();
        Subject s3 = new Subject();

        Student s = new Student();
        s.setName("Amal");
        s.setEmail("amal@gmail.com");
        s.addSubject(s1);
        s.addSubject(s2);
        s.addSubject(s3);
    }
}

class Student{
    private String name;
    private String email;
    private ArrayList<Subject> subjectsList;

    public Student() {
        subjectsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addSubject(Subject s){
        this.subjectsList.add(s);
    }
}


class Subject{
    String name;
    String teacherName;
}