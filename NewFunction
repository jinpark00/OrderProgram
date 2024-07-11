package NewProject;

import java.util.HashMap;
import java.util.Map;


public class Manage {
    private Map<String, Map<String, Product>> productMap;

    public Manage() {
        productMap = new HashMap<>();
    }

    public void addCategory(String categoryName) {
        if (!productMap.containsKey(categoryName)) {
            productMap.put(categoryName, new HashMap<>());
            System.out.println("카테고리 추가 완료");
        } else {
            System.out.println("카테고리가 이미 존재합니다.");
        }
    }

    public void addProduct(String categoryName, String productName, String description, int price) {
        if (productMap.containsKey(categoryName)) {
            Map<String, Product> products = productMap.get(categoryName);
            if (!products.containsKey(productName)) {
                products.put(productName, new Product(productName, description, price));
                System.out.println("상품 추가 완료");
            } else {
                System.out.println("상품이 이미 존재합니다");
            }
        } else {
            System.out.println("카테고리가 존재하지 않습니다.");
        }
    }

    public void removeProduct(String categoryName, String productName) {
        if (productMap.containsKey(categoryName)) {
            Map<String, Product> products = productMap.get(categoryName);
            if (products.containsKey(productName)) {
                products.remove(productName);
                System.out.println("상품 제거 완료");
            } else {
                System.out.println("상품이 카테고리에 없음");
            }
        } else {
            System.out.println("카테고리가 없음");
        }
    }

    // Remove a category
    public void removeCategory(String categoryName) {
        if (productMap.containsKey(categoryName)) {
            productMap.remove(categoryName);
            System.out.println("카테고리 제거 완료");
        } else {
            System.out.println("카테고리가 존재하지 않음");
        }
    }
}
