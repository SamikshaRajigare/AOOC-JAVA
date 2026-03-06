
class Product {
    String productName;
    double price;

    Product(String name, double p) {
        this.productName = name;
        this.price = p;
    }

    void displayProduct() {
        System.out.println("Product: " + productName + " | Price: $" + price);
    }
}

// Class to store Customer details
class Customer {
    String customerName;
    String email;

    Customer(String name, String mail) {
        this.customerName = name;
        this.email = mail;
    }

    void displayCustomer() {
        System.out.println("Customer: " + customerName + " (" + email + ")");
    }
}

// Class to handle placing orders and calculating total cost
class Order {
    void placeOrder(Customer customer, Product product, int quantity) {
        double totalCost = product.price * quantity; // Calculates total order cost
        
        System.out.println("--- Order Summary ---");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Order Cost: $" + totalCost);
        System.out.println("Status: Order placed successfully!");
    }
}


public class EcommerceApp{
    public static void main(String[] args) {
        // Creating objects
        Product laptop = new Product("Gaming Laptop", 1200.00);
        Customer user = new Customer("Samiksha", "samikasha@example.com");
        Order myOrder = new Order();

        
        myOrder.placeOrder(user, laptop, 2);
    }
}
