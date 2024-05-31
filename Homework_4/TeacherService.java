package ООП.HOMEWORKS.Homework_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService<T extends User> {
    private List<T> users = new ArrayList<>();

    public void addUser(T user) {
        users.add(user);
    }

    public void updateUser(int index, T user) {
        if (index >= 0 && index < users.size()) {
            users.set(index, user);
        } else {
            System.out.println("Учитель не найден!");
        }
    }

    public List<T> getAllUsers() {
        return users;
    }

    public T getUser(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        } else {
            System.out.println("Учитель не найден!");
            return null;
        }
    }
}
