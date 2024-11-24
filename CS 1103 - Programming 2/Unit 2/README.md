# Simple E-commerce System

This project is a **simple e-commerce system** implemented in Java. It simulates an online shopping experience where customers can browse products, add items to their cart, view the cart, and place orders. The application features a modular design with separate classes for customers, products, and orders.

---

## Features

### 1. **Browse Products**
   - Displays a list of available products with details like product ID, name, and price.
   - Users can add products to their cart by entering the product ID.

### 2. **Shopping Cart**
   - Users can view the items in their cart along with the total cost.
   - Provides options to manage the cart and proceed to checkout.

### 3. **Place Orders**
   - Users can place an order, generating an order summary with a unique order ID.
   - After an order is placed, the cart is cleared.

### 4. **Interactive Menu**
   - A user-friendly console menu allows seamless navigation between browsing, cart management, and order placement.

---

## Code Structure

### **Main Class: `App`**
- The entry point of the application.  
- Handles user interaction through a console-based menu system.
- Orchestrates customer actions like browsing products, adding to the cart, and placing orders.

### **Supporting Classes**

1. **`Product` (Package: `com.ecommerce`)**  
   - Represents a product with attributes: `productID`, `name`, and `price`.
   - Includes methods for retrieving product details and formatting product information.

2. **`Customer` (Package: `com.ecommerce`)**  
   - Represents a customer with a unique ID, name, and a shopping cart.
   - Contains methods to manage the shopping cart (add/remove products) and calculate the total cost.

3. **`Order` (Package: `com.ecommerce.orders`)**  
   - Represents an order with attributes: `orderID`, customer details, purchased products, and order total.
   - Automatically assigns a unique order ID for each new order.
   - Provides a method to generate a detailed order summary.

---

## Example Usage

Here’s an example of the application in action:

```plaintext
Welcome to the Online Store!
Available Products:
Product ID: 1, Name: Laptop, Price: $999.99
Product ID: 2, Name: Smartphone, Price: $599.99
Product ID: 3, Name: Headphones, Price: $199.99
Product ID: 4, Name: Tablet, Price: $299.99

Enter your name: Stephen
Hello, Stephen!

Menu:
1. Browse Products
2. View Cart
3. Place Order
4. Exit
Choose an option: 1

Available Products:
Product ID: 1, Name: Laptop, Price: $999.99
Product ID: 2, Name: Smartphone, Price: $599.99
Product ID: 3, Name: Headphones, Price: $199.99
Product ID: 4, Name: Tablet, Price: $299.99

Enter the Product ID to add to cart (or 0 to go back): 2
Smartphone added to cart.

Menu:
1. Browse Products
2. View Cart
3. Place Order
4. Exit
Choose an option: 2

Shopping Cart:
Product ID: 2, Name: Smartphone, Price: $599.99
Total: $599.99

Menu:
1. Browse Products
2. View Cart
3. Place Order
4. Exit
Choose an option: 3

Order placed successfully!
Order ID: 1
Customer: Stephen
Products:
Product ID: 2, Name: Smartphone, Price: $599.99
Total: $599.99

Thank you for shopping with us!
```

---

## How to Run

1. **Clone or Copy the Code**
   - Ensure the folder structure reflects the package names (e.g., `com.ecommerce` and `com.ecommerce.orders`).

2. **Compile the Code**
   ```bash
   javac com/ecommerce/*.java com/ecommerce/orders/*.java App.java
   ```

3. **Run the Application**
   ```bash
   java App
   ```

---

## Dependencies
- **Java Runtime Environment (JRE)** version 8 or later.
- No external libraries are required; the project uses standard Java libraries.

---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

---

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**