/*Задание 1
1. Интерфейс ActorBehavoir,
который будет содержать
описание возможных
действий актора в
очереди/магазине */

package ООП.HOMEWORKS.Homework_2;

public interface ActorBehavoir {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();
}
