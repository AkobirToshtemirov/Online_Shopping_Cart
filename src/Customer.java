public class Customer {

  private String name;
  private String address;
  private long contactNumber;
  private String email;

  public Customer(){

  }

  public Customer(String name, String address, long contactNumber, String email) {
    this.name = name;
    this.address = address;
    this.contactNumber = contactNumber;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public long getContactNumber() {
    return contactNumber;
  }

  public String getEmail() {
    return email;
  }

  public void showCustomerInfo(){
    System.out.println("Customer Information: ");
    System.out.println("Customer name: " + name);
    System.out.println("Customer address: " + address);
    System.out.println("Customer phone: " + contactNumber);
    System.out.println("Customer email: " + email);
  }

}
