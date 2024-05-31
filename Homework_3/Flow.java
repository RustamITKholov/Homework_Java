/*1.Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable */

package ООП.HOMEWORKS.Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;

    public Flow() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroups.add(studentGroup);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public int getGroupCount() {
        return studentGroups.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
