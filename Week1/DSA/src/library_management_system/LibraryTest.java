package library_management_system;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Abraham Silberschatz"),
                new Book(104, "Database Management", "Raghu Ramakrishnan"),
                new Book(105, "Computer Networks", "Andrew Tanenbaum")
        };

        // Linear Search
        System.out.println("Linear Search");

        Book linearResult =
                LibrarySearch.linearSearch(books, "Operating Systems");

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Book not found.");

        // Sort before Binary Search
        LibrarySearch.sortBooks(books);

        System.out.println("\nBooks After Sorting");

        for (Book book : books) {
            System.out.println(book);
        }

        // Binary Search
        System.out.println("\nBinary Search");

        Book binaryResult =
                LibrarySearch.binarySearch(books, "Operating Systems");

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Book not found.");
    }
}