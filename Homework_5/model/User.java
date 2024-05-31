package ООП.HOMEWORKS.Homework_5.model;

public abstract class User {

    private String firstName;
    private String secondName;
    private String lastName;
    private int age;

    public User(String firstName, String secondName, String lastName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", name: " + secondName + ", lastName: " + lastName + ", age: " + age + "]";
    }
}
