package OrderProgram;// KioskApp.java
import java.util.Scanner;

public class KioskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // 상품 메뉴 생성
        Product pizza = new Product("피자", "치즈가 풍부한 맛있는 피자", 12000);
        Product pasta = new Product("파스타", "신선한 재료로 만든 파스타", 10000);
        Product salad = new Product("샐러드", "건강하고 신선한 채소의 조합", 8000);
        Product hambuger= new Product("햄버거","육즙이 살아있는 햄버거",10000);

        // 메인 메뉴판 화면
        System.out.println("===== 메인 메뉴판 =====");
        System.out.println("1. " + pizza.getName() + " - " + pizza.getDescription());
        System.out.println("2. " + pasta.getName() + " - " + pasta.getDescription());
        System.out.println("3. " + salad.getName() + " - " + salad.getDescription());
        System.out.println("4. " + hambuger.getName() + " - " + hambuger.getDescription());
        System.out.println("5. Order");
        System.out.println("6. Cancel");

        while (true) {
            System.out.print("원하는 항목을 선택하세요: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    order.addToCart(pizza);
                    break;
                case "2":
                    order.addToCart(pasta);
                    break;
                case "3":
                    order.addToCart(salad);
                    break;
                case "4":
                    order.addToCart(hambuger);
                    break;
                case "5":
                    orderScreen(scanner, order);
                    break;
                case "6":
                    cancelScreen(scanner, order);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    // 주문 화면 구현
    public static void orderScreen(Scanner scanner, Order order) {
        System.out.println("===== 주문 화면 =====");
        order.showCart();
        System.out.println("1. 주문");
        System.out.println("2. 메뉴판");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                completeOrder(order);
                break;
            case "2":
                // 메인 메뉴판으로 돌아감
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
        }
    }

    // 주문 완료 화면 구현
    public static void completeOrder(Order order) {
        System.out.println("===== 주문 완료 =====");
        System.out.println("주문이 완료되었습니다. 대기번호를 발급합니다.");

        // 장바구니 초기화
        order.clearCart();

        // 3초 후 메인 메뉴판으로 돌아가는 시뮬레이션
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 메인 메뉴판으로 돌아가는 로직
        System.out.println("메인 메뉴판으로 돌아갑니다.");
    }

    // 주문 취소 화면 구현
    public static void cancelScreen(Scanner scanner, Order order) {
        System.out.println("===== 주문 취소 확인 =====");
        System.out.println("주문을 취소하시겠습니까?");
        System.out.println("1. 확인");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                order.clearCart();
                System.out.println("주문이 취소되었습니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
        }
    }
}
