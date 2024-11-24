package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.List;

/**
 * Represents an order placed by a customer.
 * 
 * @author Stephen
 */
public class Order {
    private static int orderCounter = 1;
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    public Order(Customer customer) {
        this.orderID = orderCounter++;
        this.customer = customer;
        this.products = customer.getShoppingCart();
        this.orderTotal = customer.calculateTotal();
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String generateOrderSummary() {
        StringBuilder summary = new StringBuilder("Order ID: " + orderID + "\nCustomer: " + customer.getName() +
                "\nProducts:\n");

        for (Product product : products) {
            summary.append(product).append("\n");
        }

        summary.append("Total: $").append(orderTotal);
        return summary.toString();
    }
}
