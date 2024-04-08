package com.learning.core.day3session1;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class D03P07_3 {
    public static void main(String[] args) {
        // Create a HashSet of Product objects
        Set<Product> products = new HashSet<Product>();

        // Add predefined information of 4 products to the HashSet
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Search for a particular product in the HashSet
        Product productToFind = new Product("P003", "Maruti Dezire");
        if (products.contains(productToFind)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getProductId(), product.getProductId()) && Objects.equals(getProductName(), product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getProductName());
    }
}