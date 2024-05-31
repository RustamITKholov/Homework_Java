/*Задание 1
2. Абстрактный класс Actor,
который хранит в себе
параметры актора, включая
состояние готовности сделать
заказ и факт получения
заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract*/

package ООП.HOMEWORKS.Homework_2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }
}
