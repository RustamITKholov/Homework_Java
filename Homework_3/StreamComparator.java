/*2.Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток */

package ООП.HOMEWORKS.Homework_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow o1, Flow o2) {
        return Integer.compare(o1.getGroupCount(), o2.getGroupCount());
    }
}
