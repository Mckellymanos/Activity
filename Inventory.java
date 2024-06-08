

package com.mycompany.inventory;


 import java.util.ArrayList;

class Product {
    private String productId;
    private String productName;
    private int quantity;

  
    public Product(String productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Quantity: " + quantity);
    }
}

class Inventory {
    private ArrayList<Product> products;

   
    public Inventory() {
        products = new ArrayList<>();
    }

    
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName());
    }

    
    public void removeProduct(String productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product removed: " + productToRemove.getProductName());
        } else {
            System.out.println("Product not found.");
        }
    }

   
    public void checkLowInventory(int threshold) {
        System.out.println("Products with low inventory (below " + threshold + "):");
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                product.displayProductDetails();
            }
        }
    }

  
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

       
        Product product1 = new Product("101", "Laptop", 5);
        Product product2 = new Product("102", "Smartphone", 2);
        Product product3 = new Product("103", "Tablet", 15);

        
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        
        inventory.checkLowInventory(10);

       
        inventory.removeProduct("102");

       
        inventory.checkLowInventory(10);
    }
}
