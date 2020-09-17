package lesson2.oop.abstr;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       Animal[] animals = new Animal[2];
       animals[0] = new Cat();
       animals[1] = new Dog();
       for (Animal animal : animals) {
            animal.say();
            animal.walk();
            animal.eat();
            System.out.println();
       }
    }
}
