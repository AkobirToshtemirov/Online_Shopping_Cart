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

    boolean paymentSuccess = Payment.processPayment(totalCost);

    if(paymentSuccess){
      System.out.println("Processing...");
      generateInvoice(products);
    } else
        setStatus("Cancelled!");
  }

  public void generateInvoice(List<Product> products) {
    double totalCost = cart.calculateTotal(products);

    System.out.println("Order ID: " + orderID);
    System.out.println("Customer Name: " + customer.getName());
    System.out.println("Customer Address: " + customer.getAddress());
    System.out.println("Customer Contact Number: " + customer.getContactNumber());
    System.out.println("Customer Email: " + customer.getEmail());
    System.out.println("Cart Items:");

    for(Product product : products)
      System.out.println(product.getName() + " x" + product.getQuantity() + " - $" + product.getPrice());
    
    System.out.println("Total cost: $" + totalCost);
  }

  public void trackOrderStatus(int orderID) {
    // This method can be used to track the status of a particular order.
  }

}
