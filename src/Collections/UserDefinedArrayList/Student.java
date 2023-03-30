package Collections.UserDefinedArrayList;

import java.util.List;

public class Student {
    int rollno;
    String name;

    public Student() {
    }

    Adress addresses;
    int age;

    //one student have multiple subject
    List<String> subjects;  /// group of subjects
    Student(int rollno, String name,int age, List<String> subjects, Adress addresses){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.subjects=subjects;
        this.addresses=addresses;
    }

/*    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }*/

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
