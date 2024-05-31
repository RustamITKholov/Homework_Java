package ООП.HOMEWORKS.Homework_3;

public class StudentGroup {
    private String groupName;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "group: " + "'" + groupName + '\'';
    }
}
