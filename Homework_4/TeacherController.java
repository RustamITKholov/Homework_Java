package ООП.HOMEWORKS.Homework_4;

import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private TeacherService<Teacher> teacherService = new TeacherService<>();
    private TeacherView teacherView = new TeacherView();
    private Scanner scanner = new Scanner(System.in);

    public void createTeacher() {
        System.out.print("Введите имя учителя: ");
        String secondName = scanner.nextLine();
        System.out.print("Введите фамилию учителя: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите отчество учителя: ");
        String subject = scanner.nextLine();
        System.out.print("Введите предмет учителя: ");
        String firstName = scanner.nextLine();

        Teacher teacher = new Teacher(firstName, secondName, lastName, subject);
        teacherService.addUser(teacher);
        System.out.println("Учитель добавлен.");
    }

    public void updateTeacher() {
        System.out.print("Введите индекс учителя для обновления: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите новое имя учителя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите новую фамилию учителя: ");
        String secondName = scanner.nextLine();
        System.out.print("Введите новое отчество учителя: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите новый предмет учителя: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(firstName, secondName, lastName, subject);
        teacherService.addUser(teacher);
        System.out.println("Данные учителя обновлены.");
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllUsers();
        teacherView.sendOnConsole(teachers);
    }
}
