package box;

public class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box box = new Box();

        box.setValue("value");
        Object value = box.getValue();

        System.out.println(value);
    }
}
