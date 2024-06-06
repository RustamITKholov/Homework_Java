package ООП.HOMEWORKS.Homework_6;

/*Этот интерфейс создан для метода getAllUsers.
Применён принцип разделения интерфейсов (ISP): интерфейс отвечает за чтение пользователей. */

import java.util.List;

public interface UserReader<T extends User> {
    List<T> getAllUsers();
}
