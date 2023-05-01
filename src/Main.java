import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Samsung A11", 112, 150.99f, 5));
        products.add(new Product("Honor X5", 141, 110.99f, 10));
        products.add(new Product("Redmi Note 11", 155, 182f, 3));

        Cart cart = new Cart();

        System.out.println("Online Shopping App!");

        while (true) {
            System.out.println("""
                    MENU:

                    Product Section:
                    PRODUCTS - "1";
                    ADD_PRODUCT - "2";
                    REMOVE_PRODUCT - "3";

                    Order Section:
                    PLACE_AN_ORDER - "4";
                    TRACK_ORDER_STATUS - "5";

                    Payment Section:
                    TOTAL_PAYMENT - "6";
                    PAY_FOR_PRODUCT - "7";

                    Customer Section:
                    CUSTOMER_INFORMATION - "8";

                    EXIT - '9'""");

            System.out.print("Option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1 -> product.showProducts(products);
                case 2 -> cart.addProduct(products);
                case 3 -> cart.removeProduct(products);
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid value is added!");
            }

        }

    }
}