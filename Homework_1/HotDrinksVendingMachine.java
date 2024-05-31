package ООП.HOMEWORKS.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<Product> listProduct;

    public HotDrinksVendingMachine() {
        listProduct = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> listProducts) {
        this.listProduct = listProducts;
    }

    @Override
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double value, double valueTemper) {
        for (Product product : listProduct) {
            if (product.getName().equals(name) && ((HotDrinks) product).getVolume() == value
                    && ((HotDrinks) product).getTemperature() == valueTemper) {
                return product;
            }
        }
        return null;
    }
}
