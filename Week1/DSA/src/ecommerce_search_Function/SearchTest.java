package ecommerce_search_Function;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Book", "Education")
        };

        // Linear Search
        System.out.println("Linear Search Result:");
        Product linearResult = SearchEngine.linearSearch(products, "Mobile");
        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }

        // Sort before Binary Search
        SearchEngine.sortProductsByName(products);

        System.out.println("\nProducts after sorting for Binary Search:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Binary Search
        System.out.println("\nBinary Search Result:");
        Product binaryResult = SearchEngine.binarySearch(products, "Mobile");
        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }
    }
}