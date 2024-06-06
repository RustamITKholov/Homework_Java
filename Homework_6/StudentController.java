package ООП.HOMEWORKS.Homework_6;

/*Я модернизировал интерфейс UserController. Вместо него создал 2 специализированных интерфейса (UserCreator и UserReader).Эти изменения улучшают структуру кода, делая его более гибким и поддерживаемым. Теперь классы зависят только от тех методов, которые они действительно используют. */

import java.util.ArrayList;
import java.util.List;

public class StudentController implements UserCreator<Student>, UserReader<Student> {
    private StudentGroup students = new StudentGroup(new ArrayList<>());
    private UserView<Student> userView = new UserView<>();

    // Принцип открытости/закрытости (OCP): реализация метода create может быть
    // изменена или расширена без изменения интерфейса.

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if (!students.getStudentList().isEmpty())
            maxId = students.getStudentList().get(students.getStudentList().size() - 1).getStudentId() + 1;
        Student student = new Student(maxId, firstName, secondName, lastName);
        students.addStudent(student);
    }

    @Override
    // Принцип разделения интерфейсов (ISP): метод getAllUsers является частью
    // интерфейса UserReader.
    public List<Student> getAllUsers() {
        return students.getStudentList();
    }

    // Принцип единственной ответственности (SRP): метод printStudentList отвечает
    // только за вывод списка студентов.
    public void printStudentList() {
        userView.sendOnConsole(getAllUsers());
    }
}
