import com.ecommerce.*;
import com.ecommerce.orders.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Demonstrates the functionality of the e-commerce system with interactive features
 * and error handling for invalid inputs.
 * 
 * @author Stephen Roque
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
        String customerName = scanner.nextLine().trim();
        while (customerName.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter your name: ");
            customerName = scanner.nextLine().trim();
        }
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

            int choice = getValidInteger(scanner, "Choose an option: ", 1, 4);

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product product : products) {
                        System.out.println(product);
                    }

                    int productId = getValidInteger(scanner, "Enter the Product ID to add to cart (or 0 to go back): ", 0, products.size());

                    if (productId == 0) {
                        break;
                    }

                    Product selectedProduct = products.stream()
                            .filter(p -> p.getProductID() == productId)
                            .findFirst()
                            .orElse(null);

                    if (selectedProduct != null) {
                        customer.addToCart(selectedProduct);
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

    /**
     * Prompts the user for an integer input and validates the range.
     * 
     * @param scanner Scanner for user input
     * @param prompt  Prompt message for the user
     * @param min     Minimum valid value
     * @param max     Maximum valid value
     * @return A valid integer within the specified range
     */
    private static int getValidInteger(Scanner scanner, String prompt, int min, int max) {
        int input = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return input;
    }
}
