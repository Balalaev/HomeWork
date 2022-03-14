package HomeWork4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("9 Иванов"));
        students.add(new Student("10 Петров"));
        students.add(new Student("11 Сидоров"));
        students.add(new Student("9 Григорьев"));
        students.add(new Student("9 Сергеев"));
        students.add(new Student("10 Яковлев"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.getStudent());
        }

    }
}
