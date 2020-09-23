package cast;

public class ClassCastExample {
    public static void main(String[] args) {
        Student student = new Student("Stepan");
        User user = student;
        System.out.println(user.toString());

        Student student1 = (Student) user;
        System.out.println(student1.toString());

        User user1 = new User();
        // так уже нельзя
        //Student student2 = (Student) user1;
        //System.out.println(student2.toString());
    }
}
