import java.util.List;
import java.util.Scanner;

public class Cart {

  private final Scanner SCANNER = new Scanner(System.in);
  public void addProduct(List<Product> products) {
    System.out.println("Adding product");

    System.out.print("Enter the name of the product: ");
    String name = SCANNER.next();

    System.out.print("Enter the product ID: ");
    int productID = SCANNER.nextInt();

    System.out.print("Enter the product price: ");
    float price = SCANNER.nextFloat();

    System.out.print("Enter the quantity: ");
    int quantity = SCANNER.nextInt();

    products.add(new Product(name, productID, price, quantity));
  }

  public void removeProduct(List<Product> products) {

  }


}
