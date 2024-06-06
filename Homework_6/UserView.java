package ООП.HOMEWORKS.Homework_6;

// Принцип единственной ответственности (SRP): класс UserView отвечает только за вывод данных на консоль.
import java.util.List;

public class UserView<T extends User> {
    void sendOnConsole(List<T> users) {
        for (T user : users) {
            System.out.println(user);
        }
    }
}
