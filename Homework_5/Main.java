package ООП.HOMEWORKS.Homework_5;

import java.util.ArrayList;
import java.util.List;

import ООП.HOMEWORKS.Homework_5.controller.Controller;
import ООП.HOMEWORKS.Homework_5.model.StudentGroup;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        List<Integer> studentIds = new ArrayList<>();
        studentIds.add(1);
        studentIds.add(2);

        StudentGroup studentGroup = controller.createStudentGroup(1, studentIds);

        System.out.println(studentGroup);
    }
}
