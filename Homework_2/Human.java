/*Задание 1
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir */

package ООП.HOMEWORKS.Homework_2;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
