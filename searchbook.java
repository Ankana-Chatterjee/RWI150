package practice;

import java.util.HashMap;
import java.util.Map;

class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
        initializeBooks();
    }

    private void initializeBooks() {
        // Predefined books
        books.put("Book1", new Book("Book1"));
        books.put("Book2", new Book("Book2"));
        books.put("Book3", new Book("Book3"));
        // Add more books as needed
    }

    public boolean checkAvailability(String bookTitle) {
        Book book = books.get(bookTitle);
        if (book != null) {
            return book.isAvailable();
        }
        return false;
    }
}

public class searchbook {
    public static void main(String[] args) {
        Library library = new Library();

        // Check availability of books
        System.out.println("Availability of Book1: " + library.checkAvailability("Book1"));
        System.out.println("Availability of Book2: " + library.checkAvailability("Book2"));
        System.out.println("Availability of Book4: " + library.checkAvailability("Book4"));
    }
}

