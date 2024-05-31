package ООП.HOMEWORKS.Homework_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Создать учителя");
            System.out.println("2 - Обновить данные учителя");
            System.out.println("3 - Показать всех учителей");
            System.out.println("4 - Выйти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    teacherController.createTeacher();
                    break;
                case 2:
                    teacherController.updateTeacher();
                    break;
                case 3:
                    teacherController.showAllTeachers();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Ошибка. Попробуйте ещё раз.");
            }
        }
    }
}
