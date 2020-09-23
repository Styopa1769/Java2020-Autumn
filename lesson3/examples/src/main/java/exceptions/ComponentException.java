package exceptions;

public class ComponentException extends Exception {
    String name;

    public ComponentException(String message, String name) {
        super(message);
        this.name = name;
    }

}
