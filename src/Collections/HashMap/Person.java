package Collections.HashMap;

public class Person {
    int age;
    String name;
    String stream;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Person(int age, String name, String stream) {
        this.age = age;
        this.name = name;
        this.stream = stream;
    }
}
