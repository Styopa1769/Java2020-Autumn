package lesson2.oop.abstr;

public class Cat implements Animal {

    public void say() {
        System.out.println("meow!");
    }

    public void eat() {
        System.out.println("Eating cat");
    }

    public void walk() {
        System.out.println("Walking cat");
    }
}
