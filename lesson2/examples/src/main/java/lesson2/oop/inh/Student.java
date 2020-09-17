package lesson2.oop.inh;

public class Student extends User {
    @Override
    String getName() {
        return "student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
