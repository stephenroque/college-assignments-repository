import com.ecommerce.*;
import com.ecommerce.orders.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Demonstrates the functionality of the e-commerce system with interactive features.
 * 
 * @author Stephen
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create sample products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Smartphone", 599.99));
        products.add(new Product(3, "Headphones", 199.99));
        products.add(new Product(4, "Tablet", 299.99));

        // Display products to browse
        System.out.println("Welcome to the Online Store!");
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Create a customer
        System.out.print("\nEnter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(1, customerName);
        System.out.println("Hello, " + customer.getName() + "!");

        // Interactive menu
        boolean shopping = true;
        while (shopping) {
            System.out.println("\nMenu:");
            System.out.println("1. Browse Products");
            System.out.println("2. View Cart");
            System.out.println("3. Place Order");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product product : products) {
                        System.out.println(product);
                    }

                    System.out.print("\nEnter the Product ID to add to cart (or 0 to go back): ");
                    int productId = scanner.nextInt();

                    if (productId == 0) {
                        break;
                    }

                    // Find the selected product
                    Product selectedProduct = products.stream()
                            .filter(p -> p.getProductID() == productId)
                            .findFirst()
                            .orElse(null);

                    if (selectedProduct != null) {
                        customer.addToCart(selectedProduct);
                        System.out.println(selectedProduct.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid Product ID.");
                    }
                    break;

                case 2:
                    System.out.println("\nShopping Cart:");
                    if (customer.getShoppingCart().isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (Product product : customer.getShoppingCart()) {
                            System.out.println(product);
                        }
                        System.out.println("Total: $" + customer.calculateTotal());
                    }
                    break;

                case 3:
                    if (customer.getShoppingCart().isEmpty()) {
                        System.out.println("\nYour cart is empty. Add items before placing an order.");
                    } else {
                        Order order = new Order(customer);
                        System.out.println("\nOrder placed successfully!");
                        System.out.println(order.generateOrderSummary());

                        // Clear cart after placing an order
                        customer.getShoppingCart().clear();
                    }
                    break;

                case 4:
                    shopping = false;
                    System.out.println("\nThank you for shopping with us!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
