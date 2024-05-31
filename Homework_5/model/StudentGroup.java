package ООП.HOMEWORKS.Homework_5.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentGroup:" + "\n" + teacher + "\n" + students;
    }
}
