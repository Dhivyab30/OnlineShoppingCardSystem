package Java;
import java.util.*;

//Product Class
class Product {
 int id;
 String name;
 double price;

 Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 @Override
 public String toString() {
     return id + ". " + name + " - ₹" + price;
 }
}

//Main System
public class ShoppingCartSystem {
 private static ArrayList<Product> products = new ArrayList<>();
 private static HashMap<Product, Integer> cart = new HashMap<>();
 private static LinkedList<String> orderHistory = new LinkedList<>();

 // Initialize Products
 static {
     products.add(new Product(1, "Laptop", 55000));
     products.add(new Product(2, "Smartphone", 20000));
     products.add(new Product(3, "Headphones", 1500));
     products.add(new Product(4, "Smartwatch", 3000));
     products.add(new Product(5, "Tablet", 18000));
 }

 // Display Products
 private static void showProducts() {
     System.out.println("\nAvailable Products:");
     for (Product p : products) {
         System.out.println(p);
     }
 }

 // Add to Cart
 private static void addToCart(int productId, int qty) {
     for (Product p : products) {
         if (p.id == productId) {
             cart.put(p, cart.getOrDefault(p, 0) + qty);
             System.out.println(qty + " x " + p.name + " added to cart.");
             return;
         }
     }
     System.out.println("❌ Invalid Product ID!");
 }

 // View Cart
 private static void viewCart() {
     if (cart.isEmpty()) {
         System.out.println("\n🛒 Cart is Empty!");
         return;
     }
     System.out.println("\n🛒 Cart Items:");
     double total = 0;
     for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
         Product p = entry.getKey();
         int qty = entry.getValue();
         double cost = p.price * qty;
         total += cost;
         System.out.println(p.name + " x " + qty + " = ₹" + cost);
     }
     System.out.println("👉 Total Amount: ₹" + total);
 }

 // Checkout
 private static void checkout() {
     if (cart.isEmpty()) {
         System.out.println("❌ Cart is empty. Add items before checkout!");
         return;
     }
     double total = 0;
     StringBuilder order = new StringBuilder("Order: ");
     for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
         Product p = entry.getKey();
         int qty = entry.getValue();
         total += p.price * qty;
         order.append(p.name).append(" x ").append(qty).append(", ");
     }
     order.append("Total = ₹").append(total);

     orderHistory.add(order.toString());
     System.out.println("\n✅ Checkout Successful! Total = ₹" + total);
     cart.clear();
 }

 // View Order History
 private static void viewOrderHistory() {
     if (orderHistory.isEmpty()) {
         System.out.println("\n📜 No Orders Yet!");
         return;
     }
     System.out.println("\n📜 Order History:");
     for (String order : orderHistory) {
         System.out.println(order);
     }
 }

 // Main Method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n=== Online Shopping Cart System ===");
         System.out.println("1. Show Products");
         System.out.println("2. Add to Cart");
         System.out.println("3. View Cart");
         System.out.println("4. Checkout");
         System.out.println("5. View Order History");
         System.out.println("6. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 showProducts();
                 break;
             case 2:
                 showProducts();
                 System.out.print("Enter Product ID: ");
                 int pid = sc.nextInt();
                 System.out.print("Enter Quantity: ");
                 int qty = sc.nextInt();
                 addToCart(pid, qty);
                 break;
             case 3:
                 viewCart();
                 break;
             case 4:
                 checkout();
                 break;
             case 5:
                 viewOrderHistory();
                 break;
             case 6:
                 System.out.println("👋 Thank you for shopping!");
                 break;
             default:
                 System.out.println("❌ Invalid choice!");
         }
     } while (choice != 6);

     sc.close();
 }
}
