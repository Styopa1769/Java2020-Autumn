package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Insuranceble> insurancebles = new ArrayList<>();
        insurancebles.add(new House());
        insurancebles.add(new Court());
        insurancebles.add(new Factory());

        Visitor manager = new Manager();

        for (Insuranceble insuranceble: insurancebles) {
            insuranceble.accept(manager);
        }
    }
}
