package lesson2.oop.abstr;

public class Dog implements Animal{

    public void say() {
        System.out.println("gav!");
    }

    public void eat() {
        System.out.println("Eating dog");
    }

    public void walk() {
        System.out.println("Walking dog");
    }
}
