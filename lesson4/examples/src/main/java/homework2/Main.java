package homework2;

public class Main {

    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        computers[0] = new PC("dell", "gaming", "1050ti");
        Keyboard keyboard = new Keyboard("logitech");
        computers[1] = new Laptop("dell", "gaming", keyboard);
        computers[2] = new Laptop();

        for (Computer computer: computers) {
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
            System.out.println();
        }
    }
}
