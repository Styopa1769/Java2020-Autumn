package lesson2.clazz;

public class Student {

    int age;

    String name;

    String university;

    public Student(int age, String name, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    void describe(){
        System.out.println("I am " + age + " years old. My name is " + name + ". I study in " + university);
    }
}
