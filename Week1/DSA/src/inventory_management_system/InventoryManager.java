package inventory_management_system;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<Integer, Product> inventory = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added successfully: " + product.getProductName());
        }
    }

    // Update product
    public void updateProduct(int productId, String newName, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);

        if (product != null) {
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully: " + productId);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully: " + productId);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\nCurrent Inventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}