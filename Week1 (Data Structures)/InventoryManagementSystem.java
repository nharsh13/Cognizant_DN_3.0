.
import java.util.HashMap;

// Define the Product class
class Product1 {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product1(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Define the InventoryManagementSystem class
public class InventoryManagementSystem {
    private HashMap<String, Product1> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Add product
    public void addProduct(Product1 product) {
        inventory.put(product.getProductId(), product);
    }

    // Update product
    public void updateProduct(String productId, Product1 updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Retrieve product details
    public Product1 getProduct(String productId) {
        return inventory.get(productId);
    }

    // Main method for testing
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Add products
        Product1 p1 = new Product1("001", "Laptop", 10, 999.99);
        Product1 p2 = new Product1("002", "Smartphone", 20, 599.99);
        ims.addProduct(p1);
        ims.addProduct(p2);

        // Update a product
        Product1 p3 = new Product1("001", "Laptop", 15, 999.99);
        ims.updateProduct("001", p3);

        // Retrieve and print product details
        Product1 retrievedProduct = ims.getProduct("001");
        System.out.println("Product ID: " + retrievedProduct.getProductId());
        System.out.println("Product Name: " + retrievedProduct.getProductName());
        System.out.println("Quantity: " + retrievedProduct.getQuantity());
        System.out.println("Price: " + retrievedProduct.getPrice());

        // Delete a product
        ims.deleteProduct("002");
    }
}



