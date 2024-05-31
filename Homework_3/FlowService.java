/*3.Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator */

package ООП.HOMEWORKS.Homework_3;

import java.util.List;

public class FlowService {
    public void sortFlows(List<Flow> flows) {
        flows.sort(new StreamComparator());
    }
}
