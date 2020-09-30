package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Dog dog = new Dog();
        dog.name = "sharik";
        File file = new File("dog.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(dog);
            Dog deserializedDog = (Dog) objectInputStream.readObject();
            System.out.println(deserializedDog.name);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
