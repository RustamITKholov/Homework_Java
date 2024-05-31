/*Задание 2
2. Интерфейс MarketBehaviour, который описывает
логику магазина – приход/уход покупателей,
обновление состояния магазина */

package ООП.HOMEWORKS.Homework_2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}