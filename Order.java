package OrderProgram;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> orderList = new ArrayList<>();
    private int count;
    private double totalPrice;

    public Order() {
        count = 0;
        totalPrice = 0;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void print() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[ Orders ]");
        for (Product product : orderList) {
            product.print();
            totalPrice += product.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.println("W " + totalPrice);

        System.out.println("1. 주문    2. 메뉴판");
    }

}