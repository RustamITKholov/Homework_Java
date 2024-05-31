package ООП.HOMEWORKS.Homework_4;

public class Teacher extends User {
    private String subject;

    public Teacher(String subject, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Teacher [subject: " + subject + ", " + super.toString();
    }
}
