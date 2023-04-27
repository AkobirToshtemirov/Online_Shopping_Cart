import java.util.List;

public class Product {

  private String name;
  private int productID;
  private float price;
  private int quantity;

  public Product() { }

  public Product(String name, int productID, float price, int quantity) {
    this.name = name;
    this.productID = productID;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getProductID() {
    return productID;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void showProducts(List<Product> products){
    int i = 1;
    for (Product product : products) {
      System.out.println();
      System.out.println("Product #" + i);
      System.out.println("Product name: " + product.name);
      System.out.println("Product id: " + product.productID);
      System.out.println("Product price: " + product.price);
      System.out.println("Quantity: " +product.quantity);
      System.out.println();
      i++;
    }
  }

}