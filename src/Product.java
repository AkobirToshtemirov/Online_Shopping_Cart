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
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}