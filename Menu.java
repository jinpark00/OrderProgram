package OrderProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private String title;
    private String description;

    private List<Product> products = new ArrayList<>();

    public Menu(String title, String description, List<Product> products) {
        this.title = title;
        this.description = description;
        this.products = products;
    }

    public Menu(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("||롤링파스타에 오신 것을 환영합니다||");
        System.out.println("아래 상품 메뉴를 보고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ " + title + " MENU ]");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(i + 1 + ". ");
            products.get(i).print();
        }
    }

    public void addOrder(Order order, Scanner scan) {
        Product product = products.get(scan.nextInt() - 1);
        product.print();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");

        if(scan.nextInt() == 1){
            order.getOrderList().add(product);
        }
    }
}