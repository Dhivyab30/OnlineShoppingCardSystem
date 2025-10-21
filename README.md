# OnlineShoppingCardSystem

The Online Shopping Cart System is a mini-project implemented in Java using the Collection Framework. It simulates the basic functionalities of an e-commerce shopping application where users can browse products, add/remove items to/from a cart, checkout, and view their order history.
The project is menu-driven and runs on the console. It demonstrates real-world use cases of Java Collections (Arraylist, HashMap, Linkedlist) in a modular, object-oriented design

🚀 Getting Started:
-----------------
This project is a console-based Online Shopping Cart System developed in Java. It allows users to:

✓ View available products.

✓ Add products to a shopping cart.

✓ View the cart contents and total amount.

✓ Checkout and save order history.

✓View past orders.


🧱 Prerequisites:
---------------
Before running this project, you need:

✓ Java JDK (version 8 or higher)

✓ Java IDE (optional, e.g., Eclipse, IntelliJ IDEA, or VS Code with Java support)

✓ Command Line / Terminal for compilation and running (if not using an IDE)

Requirement Version / Tools:
-----------------------------
Tool / Component	                     Recommended Version

Java JDK	                             1.8 or above

IDE	                                   IntelliJ IDEA / Eclipse

Build Tool (optional)	                 Maven or Gradle

⚙️ Installation Steps:
-------------------
1. Clone / Download Project
Download the .java files into a folder, e.g., ShoppingCartSystem.


2. Open in IDE (optional)
Import the folder into your Java IDE as a Java project.


3. Compile (if using terminal)
Open terminal in the project folder:

javac Java/ShoppingCartSystem.java


4. Run the Application

java Java.ShoppingCartSystem


🧑‍💻 Usage / Running the Application:
---------------------------------
After running, the console will display a menu:

=== Online Shopping Cart System ===
1. Show Products
2. Add to Cart
3. View Cart
4. Checkout
5. View Order History
6. Exit
Enter choice:

Option 1: Displays available products with ID, name, and price.

Option 2: Add a product to your cart by entering product ID and quantity.

Option 3: View all items in your cart along with total cost.

Option 4: Checkout your cart, confirm purchase, and save order history.

Option 5: View all previous orders.

Option 6: Exit the application.


Example Flow:
-------------
1. User starts the application.


2. Views products:

1. Laptop - ₹55000
2. Smartphone - ₹20000
3. Headphones - ₹1500
4. Smartwatch - ₹3000
5. Tablet - ₹18000


3. Adds 2 Laptops and 1 Smartwatch to the cart.


4. Views the cart:

Laptop x 2 = ₹110000
Smartwatch x 1 = ₹3000
Total Amount = ₹113000


5. Proceeds to checkout:

✅ Checkout Successful! Total = ₹113000


6. Views order history:

Order: Laptop x 2, Smartwatch x 1, Total = ₹113000


🧪 Running Tests:
---------------
Currently, this is a console-based project without automated unit tests.
To test manually:

✓ Try adding invalid product IDs to check error handling.

✓ Add multiple products and verify the total amount calculation.

✓ Checkout with empty cart to ensure proper messages display.


🌐 Deployment:
------------
This is a desktop/console Java application. No server deployment is required.

To run on other machines:

1. Ensure Java JDK is installed.


2. Copy the .java files.


3. Compile and run using:

javac Java/ShoppingCartSystem.java
java Java.ShoppingCartSystem


🛠️ Build With:
------------ 

✓ Java – Programming language.

✓ Collections Framework – ArrayList, HashMap, LinkedList.

✓ OOP Concepts – Classes, Objects, Encapsulation.

✓ Scanner – For user input.

✓ Console-based I/O – System.out.println.

🏁 Conclusion:
-----------

The Online Shopping Cart System is a simple Java project that uses the Collection Framework to manage products, cart items, and order history. It shows how Arraylist, HashMap, and linkedlist can be used effectively in real applications. The project is easy to use, menu-driven, and demonstrates the basic idea of an online shopping system in a clear and practical way.
