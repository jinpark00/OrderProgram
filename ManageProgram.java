package OrderProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageProgram {
    private ArrayList<Category> categories = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ManageProgram() {
        this.categories = new ArrayList<>();
    }

    public void addCategory() {
        System.out.println("새로운 카테고리 이름을 입력하세요:");
        String categoryName = scanner.nextLine();
        Category newCategory = new Category(categoryName);
        categories.add(newCategory);
        System.out.println("카테고리가 추가되었습니다.");
    }

    public void removeCategory() {
        if (categories.isEmpty()) {
            System.out.println("카테고리가 없습니다.");
            return;
        }

        System.out.println("삭제할 카테고리 이름을 입력하세요:");
        String categoryName = scanner.nextLine();

        for (Category category : categories) {
            if (category.getName().equals(categoryName)) {
                categories.remove(category);
                System.out.println("카테고리가 삭제되었습니다.");
                return; // Exit after successful removal
            }
        }
        System.out.println("해당 카테고리가 존재하지 않습니다.");
    }

    public void addProductToCategory(Category category) {
        System.out.println("상품 이름을 입력하세요:");
        String productName = scanner.nextLine();
        System.out.println("상품 설명을 입력하세요:");
        String productDescription = scanner.nextLine();
        System.out.println("상품 가격을 입력하세요:");
        double productPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        Product newProduct = new Product(productName, productDescription, productPrice);
        category.addProduct(newProduct);
        System.out.println("상품이 카테고리에 추가되었습니다.");
    }

    public void removeProductFromCategory(Category category) {
        System.out.println("삭제할 상품 이름을 입력하세요:");
        String productName = scanner.nextLine();

        for (Product product : category.getProducts()) {
            if (product.getName().equals(productName)) {
                category.removeProduct(product);
                System.out.println("상품이 카테고리에서 삭제되었습니다.");
                return; // Exit after successful removal
            }
        }
        System.out.println("해당 상품이 존재하지 않습니다.");
    }

    // ... (Other methods if needed) ...
}