package exceptions;

public class TryCatchExample {

    public static void main(String[] args) {
        String s = "i am not int";

        try {
            System.out.println("hi");
            Integer integer = cast(s);
            System.out.println("hi2");
        } catch (NumberFormatException exception) {
            //System.out.println(exception.getMessage());
        }

    }

    public static Integer cast(String s) throws NumberFormatException{
        return Integer.parseInt(s);
    }
}
