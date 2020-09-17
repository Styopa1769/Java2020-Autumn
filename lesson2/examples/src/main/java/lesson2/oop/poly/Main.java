package lesson2.oop.poly;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat();
        animals[1] = new Dog();

        for (Animal animal : animals) {
            System.out.println(animal.say());
        }
    }
}
