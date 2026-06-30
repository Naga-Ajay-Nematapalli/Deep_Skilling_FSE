package sorting_customer_orders;

public class SortTest {

    public static void main(String[] args) {

        Order[] ordersForBubble = {
                new Order(101, "Ajay", 4500),
                new Order(102, "Ravi", 1200),
                new Order(103, "Sneha", 7800),
                new Order(104, "Kiran", 3200)
        };

        Order[] ordersForQuick = {
                new Order(101, "Ajay", 4500),
                new Order(102, "Ravi", 1200),
                new Order(103, "Sneha", 7800),
                new Order(104, "Kiran", 3200)
        };

        System.out.println("Original Orders:");
        Sortservice.displayOrders(ordersForBubble);

        // Bubble Sort
        Sortservice.bubbleSort(ordersForBubble);
        System.out.println("\nOrders after Bubble Sort:");
        Sortservice.displayOrders(ordersForBubble);

        // Quick Sort
        Sortservice.quickSort(ordersForQuick, 0, ordersForQuick.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        Sortservice.displayOrders(ordersForQuick);
    }
}