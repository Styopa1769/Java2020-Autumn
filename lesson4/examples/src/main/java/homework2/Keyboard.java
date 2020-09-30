package homework2;

public class Keyboard {
    String model;

    public Keyboard(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "model='" + model + '\'' +
                '}';
    }
}
