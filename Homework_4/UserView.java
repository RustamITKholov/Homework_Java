package ООП.HOMEWORKS.Homework_4;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> users);
}
