package OrderProgram;
import java.util.ArrayList;
import java.util.List;
public class Order {
        private List<Product> cart;
        private int total;

        public Order() {
            this.cart = new ArrayList<>();
            this.total = 0;
        }

        public void addToCart(Product product) {
            cart.add(product);
            total += product.getPrice();
            System.out.println(product.getName() + "이(가) 장바구니에 추가되었습니다.");
        }

        public void showCart() {
            System.out.println("===== 장바구니 목록 =====");
            for (Product product : cart) {
                System.out.println(product.getName() + " : " + product.getPrice() + "원");
            }
            System.out.println("총 가격: " + total + "원");
        }

        public void clearCart() {
            cart.clear();
            total = 0;
            System.out.println("장바구니가 초기화되었습니다.");
        }
    }
