import java.util.ArrayList;
import java.util.Scanner;
class Book {
    String title, author, ISBN;
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}
class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added.");
    }
    void removeBook(String ISBN) {
        books.removeIf(b -> b.ISBN.equals(ISBN));
        System.out.println("Book removed (if found).");
    }
    void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.title.contains(keyword) || b.author.contains(keyword) || b.ISBN.equals(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No book found.");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Book\n2. Remove Book\n3. Search Book\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                System.out.print("Enter ISBN: ");
                String ISBN = sc.nextLine();
                lib.addBook(new Book(title, author, ISBN));
            } else if (choice == 2) {
                System.out.print("Enter ISBN to remove: ");
                String ISBN = sc.nextLine();
                lib.removeBook(ISBN);
            } else if (choice == 3) {
                System.out.print("Enter keyword to search: ");
                String keyword = sc.nextLine();
                lib.searchBook(keyword);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
