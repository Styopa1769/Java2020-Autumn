package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //before stream
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                sum += i*i;
        }
        System.out.println(sum);

        //stream
        int result = IntStream.iterate(0, n -> n + 1)
                .limit(10)
                .filter(n -> n % 2 == 0)
                .map(n -> n*n).sum();
        System.out.println(result);

        //fact
        System.out.println("fact: " + fact(5));

        //collectors, of
        Student[] students = {new Student("First1", "Last1"), new Student("First2", "Last2")};
        List<Student> studentList = Arrays.asList(students);
        //List<Student> studentList = Stream.of(students).collect(Collectors.toList());
        System.out.println(studentList);
        Map<String, Student> studentMap = studentList.stream()
                .collect(Collectors.toMap(Student::getLastName, student -> student));
        System.out.println(studentMap);
    }

    private static int fact(int i){
        return IntStream.range(1, i + 1).reduce((n1, n2) -> n1*n2).orElse(1);
    }
}
