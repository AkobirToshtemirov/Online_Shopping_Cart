public class Payment {

  public static boolean processPayment(double amount){
    boolean paymentSuccess = amount > 0;
    return paymentSuccess;
  }

  public void updateOrderStatus(int orderID, String status) {
    // This method can be used to update the status of a particular order.
  }

}
