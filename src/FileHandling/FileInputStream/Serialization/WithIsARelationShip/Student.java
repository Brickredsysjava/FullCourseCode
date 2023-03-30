package FileHandling.FileInputStream.Serialization.WithIsARelationShip;

public class Student extends Person{
    String course;
    int fee;
    Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course=course;
        this.fee=fee;
    }
}
