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
    System.out.print("Enter product name or product ID to remove it: ");
    String input = SCANNER.next();
    int inp = -1;
    if (input.matches("\\d+")) {
      inp = Integer.parseInt(input);
    }

    for (Product product : products) {
      if (product.getName().equals(input)) {
        makeStructure(products, product);
        break;
      }
      if (product.getProductID() == inp) {
        makeStructure(products, product);
        break;
      }

      else if (product == products.get(products.size() - 1)) {
        System.out.println("Invalid value is added. Please try again. Make sure you are entering available product!");
      }
    }
  }

  public void showProducts(List<Product> products) {
    int i = 1;
    for (Product product : products) {
      System.out.println();
      System.out.println("Product #" + i);
      System.out.println("Product name: " + product.getName());
      System.out.println("Product ID: " + product.getProductID());
      System.out.println("Product price: $" + product.getPrice());
      System.out.println("Quantity: " + product.getQuantity());
      System.out.println();
      i++;
    }

    int totalProduct = calculateTotal(products);
    System.out.println("Total amount of products: " + totalProduct);
  }

  public int calculateTotal(List<Product> products) {
    int sum = 0;

    for (Product product : products)
      sum += product.getQuantity();

    return sum;
  }

  public void makeStructure(List<Product> products, Product product) {
    System.out.println("Product has been removed! Removed product:");
    System.out.println("Product name: " + product.getName() + " | product ID: " + product.getProductID());
    products.remove(product);
  }

  public void showCustomerInfo(Customer customer) {
    System.out.println("Customer Information: ");
    System.out.println("Customer name: " + customer.getName());
    System.out.println("Customer address: " + customer.getAddress());
    System.out.println("Customer phone: " + customer.getContactNumber());
    System.out.println("Customer email: " + customer.getEmail());
  }

}
