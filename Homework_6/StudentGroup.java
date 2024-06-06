package ООП.HOMEWORKS.Homework_6;

// Принцип единственной ответственности (SRP): класс StudentGroup отвечает только за управление списком студентов.

import java.util.List;

public class StudentGroup {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}
