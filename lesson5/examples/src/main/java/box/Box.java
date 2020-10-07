package box;

import java.util.ArrayList;
import java.util.List;

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

        box.setValue(new Integer(0));
        Object value = box.getValue();
        String stringValue;

        if (value instanceof String)
            stringValue = (String) value;
        else
            stringValue = "empty";

        System.out.println(stringValue);

        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box());

        for (Box item : boxes) {
            System.out.println(item);
        }
    }
}
