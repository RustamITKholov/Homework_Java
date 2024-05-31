package ООП.HOMEWORKS.Homework_5.controller;

import java.util.ArrayList;
import java.util.List;

import ООП.HOMEWORKS.Homework_5.model.Student;
import ООП.HOMEWORKS.Homework_5.model.StudentGroup;
import ООП.HOMEWORKS.Homework_5.model.Teacher;
import ООП.HOMEWORKS.Homework_5.service.StudentGroupService;;

public class Controller {
    private List<Teacher> teachers;
    private List<Student> students;
    private StudentGroupService studentGroupService;

    public Controller() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        studentGroupService = new StudentGroupService();

        teachers.add(new Teacher(1, "Anna", "Ivanova", "Stepanovna", 56));
        teachers.add(new Teacher(2, "Ludmila", "Bunina", "Valerievna", 45));

        students.add(new Student(1, "Pavel", "Smolin", "Andreevich", 15));
        students.add(new Student(2, "Andrey", "Tokarev", "Alekseevich", 16));
        students.add(new Student(3, "Vladimir", "Putin", "Vladimirovich", 17));
        students.add(new Student(4, "Aleksey", "Matveev", "Nikolaevich", 16));
    }

    public StudentGroup createStudentGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = findTeacherById(teacherId);
        List<Student> studentList = new ArrayList<>();

        for (int studentId : studentIds) {
            Student student = findStudentById(studentId);
            if (student != null) {
                studentList.add(student);
            }
        }
        return studentGroupService.createStudentGroup(teacher, studentList);
    }

    private Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        return null;
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }
}
