package annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Hello h=new Hello();
        Method m=h.getClass().getMethod("sayHello");

        MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + myAnnotation.value());
    }
}
