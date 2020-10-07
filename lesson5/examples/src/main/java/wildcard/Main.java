package wildcard;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("cat"));

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("dog"));

        ArrayList<Pet> pets = new ArrayList<>();


        copy(pets, dogs);

    }

    /**
     * @param dest consumer super - лист, в который будем писать новые значения (потребляет значения)
     *             если бы не было ограничения ? super T, то мы бы могли, например, в массив кошек положить собак и т.п.,
     *             а так мы можем здесь использовать только лист, в который гарантированно можем поместить все из src
     * @param src producer extends - лист, из которого мы будем читать значения (поставляет значения)
     *            если бы не было ограничения ? extends T, то мы бы могли, например, в массив питомцев положить Object и т.п.,
     *            а так мы помещаем только то, что гарантированно поместится в dest
     */
    public static <T> void copy(ArrayList<? super T> dest, ArrayList<? extends T> src) {
        int var2 = src.size();
        if (var2 > dest.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        } else {
            for(int i = 0; i < var2; ++i) {
                dest.set(i, src.get(i));
            }

        }
    }
}
