package exceptions;

import java.io.*;

public class Component {

    public static void main(String[] args) {
        String s = "not number";
        try {
            Integer i = parse(s);
            System.out.println(i);
        } catch (ComponentException e) {
            e.printStackTrace();
        }

    }

    public static Integer parse(String s) throws ComponentException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new ComponentException("component exception", "Stepan");
        }
    }

}
