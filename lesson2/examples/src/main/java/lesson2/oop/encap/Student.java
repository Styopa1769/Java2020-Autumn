package lesson2.oop.encap;

public class Student {

    private int age;

    private String name;

    private String university;

    public Student(int age, String name, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public void describe(){
        System.out.println("I am " + age + " years old. My name is " + name + ". I study in " + university);
    }
}
