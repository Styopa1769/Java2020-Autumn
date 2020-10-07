package box;

public class BoxGeneric<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BoxGeneric<String> box = new BoxGeneric<>();

        box.setValue("value");
        String value = box.getValue();

        System.out.println(value);
    }
}
