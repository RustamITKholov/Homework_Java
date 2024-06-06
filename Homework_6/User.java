package ООП.HOMEWORKS.Homework_6;

// Принцип единственной ответственности (SRP): класс User отвечает только за хранение данных пользователя.
public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return ", firstName: " + firstName + ", secondName: " + secondName + ", lastName: " + lastName + "]";
    }
}
