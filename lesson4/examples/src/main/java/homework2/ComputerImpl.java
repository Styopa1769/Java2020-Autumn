package homework2;

public abstract class ComputerImpl implements Computer {
    String maker;
    String model;

    public ComputerImpl(String maker, String model) {
        this.maker = maker;
        this.model = model;
    }

    public ComputerImpl(){
        this.maker = "default maker";
        this.model = "default model";
    }

    @Override
    public String turnOn() {
        return "Turn on " + toString();
    }

    @Override
    public String turnOff() {
        return "Turn off " + toString();
    }

    @Override
    public String connect() {
        return "Connect to internet " + toString();
    }
}
