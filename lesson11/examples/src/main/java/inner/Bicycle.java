package inner;

/**
 * Пример обычного вложенного класса
 */
public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.left();
        steeringWheel.right();
    }

    private class SteeringWheel {

        public void right() {
            System.out.println(model + ": руль вправо!");
        }

        public void left() {

            System.out.println(model + ": руль влево!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println(model + ": сиденье поднято выше!");
        }

        public void down() {

            System.out.println(model + ": сиденье опущено ниже!");
        }
    }
}
