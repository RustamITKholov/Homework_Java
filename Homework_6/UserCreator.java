package ООП.HOMEWORKS.Homework_6;

/*Этот интерфейс создан для метода create.
Применён принцип разделения интерфейсов (ISP): интерфейс отвечает за создание пользователей.*/

public interface UserCreator<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
