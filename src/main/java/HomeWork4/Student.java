package HomeWork4;

import java.util.List;

public class Student implements Comparable<Student> {

    private String student;

    public Student(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public int getClassNumber() {
        String s = this.student;
        return Integer.parseInt(s.substring(0, s.indexOf(" ")));
    }

    public String getLastName() {
        String s = this.student;
        return s.substring(s.indexOf(" ")+1);
    }

    @Override
    public int compareTo(Student s) {
        int result = (this.getClassNumber()!=(s.getClassNumber())? (this.getClassNumber()-s.getClassNumber()) : (this.getLastName().compareTo(s.getLastName())));
        return result;
    }


}
