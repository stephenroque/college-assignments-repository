import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

// Define the Book class to represent individual books
class Book {
    String title;
    String author;
    int quantity; // Total quantity of the book in the library
    int borrowed; // Quantity of the book that has been borrowed

    // Constructor to initialize the Book object
    Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.borrowed = 0; // Initially, no copies of the book are borrowed
    }
}

// Define the LibrarySystem class to manage the library
public class LibrarySystem {
    private HashMap<String, Book> library; // HashMap to store books using their titles as keys

    // Constructor to initialize the LibrarySystem object
    public LibrarySystem() {
        library = new HashMap<>();
    }

    // Method to add a new book or update the quantity of an existing book in the library
    public void addBook(String title, String author, int quantity) {
        if (library.containsKey(title)) {
            // Book already exists, update quantity
            Book existingBook = library.get(title);
            existingBook.quantity += quantity;
            System.out.println("Quantity of \"" + title + "\" updated to " + existingBook.quantity);
        } else {
            // Book is new, add it to the library
            library.put(title, new Book(title, author, quantity));
            System.out.println("Book \"" + title + "\" added to the library.");
        }
    }

    // Method to borrow a specified quantity of a book from the library
    public void borrowBook(String title, int quantity) {
        if (library.containsKey(title)) {
            Book book = library.get(title);
            if (book.quantity - book.borrowed >= quantity) {
                // Sufficient copies of the book are available for borrowing
                book.borrowed += quantity;
                System.out.println("You have borrowed " + quantity + " copies of \"" + title + "\".");
            } else {
                // Insufficient copies of the book are available for borrowing
                System.out.println("Sorry, only " + (book.quantity - book.borrowed) + " copies of \"" + title + "\" are available for borrowing.");
            }
        } else {
            // The specified book is not available in the library
            System.out.println("The book \"" + title + "\" is not available in the library.");
        }
    }

    // Method to return a specified quantity of a borrowed book to the library
    public void returnBook(String title, int quantity) {
        if (library.containsKey(title)) {
            Book book = library.get(title);
            if (book.borrowed >= quantity) {
                // The specified quantity of the book has been borrowed and can be returned
                book.borrowed -= quantity;
                System.out.println("You have returned " + quantity + " copies of \"" + title + "\".");
            } else {
                // The specified quantity exceeds the number of copies borrowed
                System.out.println("You have only borrowed " + book.borrowed + " copies of \"" + title + "\".");
            }
        } else {
            // The specified book does not belong to the library
            System.out.println("The book \"" + title + "\" does not belong to the library system.");
        }
    }

    // Main method to run the library system
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem(); // Create a new LibrarySystem object
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Main loop for the library system menu
        while (true) {
            // Display the library system menu
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = 0; // Variable to store the selected menu option
            try {
                // Read the selected menu option from the user
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                // Handle non-integer input for menu options
                System.out.println("Invalid option. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue;
            }

            switch (option) {
                case 1:
                    // Option to add a new book or update the quantity of an existing book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    int quantity = 0;
                    try {
                        // Read the quantity of books from the user
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                    } catch (InputMismatchException e) {
                        // Handle non-integer input for book quantity
                        System.out.println("Invalid quantity. Please enter an integer value.");
                        scanner.nextLine(); // Consume invalid input
                        continue;
                    }
                    // Add the book to the library or update its quantity
                    librarySystem.addBook(title, author, quantity);
                    break;
                case 2:
                    // Option to borrow a specified quantity of a book from the library
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    quantity = 0;
                    try {
                        // Read the quantity of books to borrow from the user
                        System.out.print("Enter quantity to borrow: ");
                        quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                    } catch (InputMismatchException e) {
                        // Handle non-integer input for book quantity
                        System.out.println("Invalid quantity. Please enter an integer value.");
                        scanner.nextLine(); // Consume invalid input
                        continue;
                    }
                    // Borrow the specified quantity of the book from the library
                    librarySystem.borrowBook(title, quantity);
                    break;
                case 3:
                    // Option to return a specified quantity of a borrowed book to the library
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    quantity = 0;
                    try {
                        // Read the quantity of books to return from the user
                        System.out.print("Enter quantity to return: ");
                        quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                    } catch (InputMismatchException e) {
                        // Handle non-integer input for book quantity
                        System.out.println("Invalid quantity. Please enter an integer value.");
                        scanner.nextLine(); // Consume invalid input
                        continue;
                    }
                    // Return the specified quantity of the borrowed book to the library
                    librarySystem.returnBook(title, quantity);
                    break;
                case 4:
                    // Option to exit the library system
                    scanner.close(); // Close the Scanner object
                    System.out.println("Exiting the program...");
                    System.exit(0); // Exit the program
                default:
                    // Handle invalid menu option
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
