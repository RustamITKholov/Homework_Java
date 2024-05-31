
package ООП.HOMEWORKS.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {
    List<Product> listProduct;

    public VendingMachineBottleOfWater() {
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

    // Перегрузка метода!
    public Product getProduct(String name, double value) {
        for (Product product : listProduct) {
            if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == value) {
                return product;
            }
        }
        return null;
    }
}
