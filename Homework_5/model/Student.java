package ООП.HOMEWORKS.Homework_5.model;

public class Student extends User {

    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName, int age) {
        super(firstName, secondName, lastName, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "\n [Student - [id: " + studentId + ", " + super.toString();
    }

}
