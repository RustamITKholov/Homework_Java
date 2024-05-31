
package ООП.HOMEWORKS.Homework_1;

import java.util.ArrayList;
import java.util.List;

interface VendingMachine {

    public void initProducts(List<Product> listProducts);

    void addProduct(Product product);

    public Product getProduct(String name);

}
