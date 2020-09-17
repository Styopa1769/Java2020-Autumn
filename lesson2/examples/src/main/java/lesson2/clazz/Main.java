package lesson2.clazz;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(23, "Stepan","MIPT");

        Student student2 = new Student(23, "Stepan","MIPT");

        String s = "stepan";
        String s2 = new String("stepan");

        System.out.println(s.equals(s2));
    }
}
