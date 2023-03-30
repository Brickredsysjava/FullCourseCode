package Collections.Comaparator;

import Collections.HashMap.Person;

import java.util.Comparator;

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student>{

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b) {

        return a.rollno - b.rollno;
    }
    /*
    public boolean compare(Student a, Student b){
        return a.rollno < b.rollno;
    }*/
}
