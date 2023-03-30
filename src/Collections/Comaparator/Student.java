package Collections.Comaparator;
// Java Program to Demonstrate Working of
// Comparator Interface

// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;

// Class 1
// A class to represent a Student
class Student implements Comparable<Student>{

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address)
    {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }

    public int compareTo(Student st){
        if(rollno==st.rollno)
            return 0;
        else if(rollno<st.rollno)
            return 1;
        else
            return -1;
    }
}

// Class 4
// Main class

