package homework2;

public class Laptop extends ComputerImpl{

    Keyboard keyboard;

    public Laptop(String maker, String model, Keyboard keyboard) {
        super(maker, model);
        this.keyboard = keyboard;
    }

    public Laptop(){
        this.keyboard = new Keyboard("default keyboard");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "keyboard=" + keyboard +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
