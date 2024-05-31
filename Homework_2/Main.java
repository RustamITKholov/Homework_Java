package ООП.HOMEWORKS.Homework_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human client_1 = new Human("Andrey");
        Human client_2 = new Human("Dmitriy");
        Human client_3 = new Human("Victor");
        market.acceptToMarket(client_1);
        market.acceptToMarket(client_2);
        market.acceptToMarket(client_3);
        market.update();
    }
}
