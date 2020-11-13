package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Insurable> insurables = new ArrayList<>();
        insurables.add(new House());
        insurables.add(new Court());
        insurables.add(new Factory());

        Visitor<String> manager = new Manager();

        for (Insurable insurable : insurables) {
            System.out.println(insurable.accept(manager));
        }
    }
}
