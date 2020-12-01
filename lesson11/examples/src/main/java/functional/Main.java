package functional;

import inner.Airplane;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap1 = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(Integer::compareTo);
        TreeMap<Integer, String> treeMap3 = new TreeMap<>(Comparator.naturalOrder());

        Consumer<String> consumer = s -> System.out.println(s);
        String myString = "My String";
        consumer.accept(myString);

        Supplier<String> supplier = () -> "My string from supplier";
        consumer.accept(supplier.get());

        Predicate<String> predicate = s -> s.startsWith("My");
        if (predicate.test(myString)){
            consumer.accept(myString);
        }
        
        Function<String, Boolean> function = s -> s.startsWith("My");
        if (function.apply(myString)){
            consumer.accept(myString);
        }
    }
}
