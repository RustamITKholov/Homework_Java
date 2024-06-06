package ООП.HOMEWORKS.Homework_6;

// Принцип единственной ответственности (SRP): класс Student расширяет User, добавляя идентификатор студента.

public class Student extends User {
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId: " + studentId + super.toString();
    }
}
