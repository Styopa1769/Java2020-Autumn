package cast;

public class Student extends User {

    public Student(String name) {
        super(name);
    }

    public void study(){
        System.out.println("Study");
    }

    @Override
    String getName() {
        return "student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
