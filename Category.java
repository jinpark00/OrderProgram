package OrderProgram;

import java.util.ArrayList;
public class Category {
    private String name;
    private ArrayList<Product> products;
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public void print() {
        System.out.println("[ " + name + " MENU ]");
        for (Product product : products) {
            product.print();
        }
    }
}