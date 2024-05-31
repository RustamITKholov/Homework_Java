package ООП.HOMEWORKS.Homework_5.model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName, int age) {
        super(firstName, secondName, lastName, age);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher - [id: " + teacherId + ", " + super.toString() + ";";
    }
}
