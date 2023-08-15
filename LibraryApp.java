package libraryCatalogSystem;

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book b1 = new Book("Author 1", "Book 1");
        Book b2 = new Book("Author 2", "Book 2");
        Book b3 = new Book("Author 3", "Book 3");
        Book b4 = new Book("Author 4", "Book 4");
        Book b5 = new Book("Author 5", "Book 5");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Scanner scanner = new Scanner(System.in);

        String[] options = {
            "Browse Catalog",
            "Borrow Book",
            "Return Book",
            "Exit"
        };

        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= options.length) {
                switch (choice) {
                case 1:
                    System.out.println("You selected: Browse Catalog");
                    System.out.println("Available Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i).getTitle() + " by " + books.get(i).getAuthor());
                    }
                    break;
                case 2:
                    System.out.println("You selected: Borrow Book");
                    System.out.print("Enter the number of the book you want to borrow: ");
                    int borrowChoice = scanner.nextInt();
                    if (borrowChoice >= 1 && borrowChoice <= books.size()) {
                        Book selectedBook = books.get(borrowChoice - 1);
                        System.out.println("You borrowed: " + selectedBook.getTitle());
                        // Add your code for marking the book as borrowed
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
                case 3:
                    System.out.println("You selected: Return Book");
                    System.out.print("Enter the number of the book you want to return: ");
                    int returnChoice = scanner.nextInt();
                    if (returnChoice >= 1 && returnChoice <= books.size()) {
                        Book returnedBook = books.get(returnChoice - 1);
                        System.out.println("You returned: " + returnedBook.getTitle());
                        // Add your code for marking the book as returned
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                    case 4:
                        System.out.println("Exiting the menu.");
                        scanner.close();
                        System.exit(0); // Exit the program
                        break;
                }
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
