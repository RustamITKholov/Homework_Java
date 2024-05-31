package ООП.HOMEWORKS.Homework_5.service;

import java.util.List;

import ООП.HOMEWORKS.Homework_5.model.Teacher;
import ООП.HOMEWORKS.Homework_5.model.Student;
import ООП.HOMEWORKS.Homework_5.model.StudentGroup;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(teacher);
        for (Student student : students) {
            studentGroup.addStudent(student);
        }
        return studentGroup;
    }
}
