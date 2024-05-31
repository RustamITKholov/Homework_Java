package ООП.HOMEWORKS.Homework_1;

public class Main {
    public static void main(String[] args) {
        Product product = new BottleOfWater("Cola", 120, 0.9);
        Product product1 = new BottleOfWater("Sprite", 95, 0.9);
        Product product2 = new HotDrinks("Coffee", 150, 0.2, 41.3);
        Product product3 = new HotDrinks("Tea", 100, 0.3, 38.0);
        // Product product1 = new Product("Milk", 100);
        // Product product2 = new Product("Bread", 50);
        // Product product3 = new Product("Eggs", 150);
        VendingMachine vendingMachine = new VendingMachineBottleOfWater();
        VendingMachine vendingMachine2 = new HotDrinksVendingMachine();
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product1);
        vendingMachine2.addProduct(product2);
        vendingMachine2.addProduct(product3);
        // vendingMachine.addProduct(product1);
        // vendingMachine.addProduct(product2);
        // vendingMachine.addProduct(product3);
        // System.out.println(vendingMachine.getProduct("Cola").getCost());
        System.out.println(vendingMachine.getProduct("Cola"));
        System.out.println(vendingMachine.getProduct("Sprite"));
        System.out.println(vendingMachine2.getProduct("Tea"));
        System.out.println(vendingMachine2.getProduct("Coffee"));
    }
}
