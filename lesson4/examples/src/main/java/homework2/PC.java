package homework2;

public class PC extends ComputerImpl {
    private String GPU;

    public PC(String maker, String model, String GPU) {
        super(maker, model);
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "PC{" +
                "GPU='" + GPU + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
