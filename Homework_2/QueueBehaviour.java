/*Задание 2
1. Интерфейс QueueBehaviour, который описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа */

package ООП.HOMEWORKS.Homework_2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void makeOrders();

    void releaseFromQueue();
}
