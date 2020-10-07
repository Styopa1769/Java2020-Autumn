package wildcard;

public class Pet extends Animal {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call(){
        System.out.println(name + " is calling...");
    }
}
