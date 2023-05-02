import java.util.List;
import java.util.Scanner;

public class Order {

  // Fields
  private int orderID;
  private Cart cart;
  private Customer customer;
  private String status;

  public Order(int orderID, Cart cart, Customer customer) {
    this.orderID = orderID;
    this.cart = cart;
    this.customer = customer;
    this.status = "pending";
  }

  public int getOrderID() {
    return orderID;
  }

  public Cart getCart() {
    return cart;
  }

  public Customer getCustomer() {
    return customer;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void placeOreder(List<Product> products) {
    double totalCost = cart.calculateTotal(products);

  }

  public void trackOrderStatus(int orderID) {
    // This method can be used to track the status of a particular order.
  }

  public void generateInvoice(int orderID) {
    // This method can be used to generate an invoice for a particular order.
  }

}
