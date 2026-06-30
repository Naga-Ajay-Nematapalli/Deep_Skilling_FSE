package inventory_management_system;
public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        // Add products
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayInventory();

        // Update product
        manager.updateProduct(102, "Wireless Mouse", 45, 750);

        manager.displayInventory();

        // Delete product
        manager.deleteProduct(103);

        manager.displayInventory();
    }
}