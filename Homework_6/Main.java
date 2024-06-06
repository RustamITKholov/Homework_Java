package ООП.HOMEWORKS.Homework_6;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("Putin", "Vladimir", "Vladimirovich");
        controller.create("Kholov", "Rustam", "Bahtiyorovich");
        controller.create("Ivanov", "Ivan", "Alekseevich");
        controller.printStudentList();
    }
}
