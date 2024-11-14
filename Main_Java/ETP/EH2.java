// Practice Question (Medium Level):

// You are tasked with implementing a library management system in Java. 
// One of the requirements is to ensure that the borrowed books are returned within a specified duration. 
// If a user fails to return a book within the due date, they should be fined.

// Write a Java program that models this library management system. 
// Implement a custom exception called `BookReturnException`, which should be thrown when a user fails to return a book within the due date. 
// The exception should include details such as the name of the book, the borrower's name, and the due date.

// Your program should allow users to borrow books and return them. 
// When a book is borrowed, record the borrower's name, the book's name, and the due date. 
// When a book is returned, check if it's returned on time. If not, throw a `BookReturnException` with appropriate details.

// Your program should handle exceptions gracefully and provide meaningful error messages to users.

// Feel free to include additional features or functionalities to enhance the system.

// Write your implementation below and I'll check it for you once you submit it.
import java.util.*;
class BookReturnException extends Exception{
    String Bookname;
    String name;
    int dueDate;
    BookReturnException(String Bookname,String name,int dueDate){
        super("\nName : "+name+"\nBook name: "+Bookname+"\nDue date : "+dueDate);
    }
}

class Book {
    private String name;
    private String borrowerName;
    private int dueDate;

    public Book(String name, String borrowerName, int dueDate) {
        this.name = name;
        this.borrowerName = borrowerName;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public int getDueDate() {
        return dueDate;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void borrowBook(String bookName, String borrowerName, int dueDate) {
        books.add(new Book(bookName, borrowerName, dueDate));
        System.out.println("Book '" + bookName + "' borrowed by " + borrowerName + " due on " + dueDate);
    }

    public void returnBook(String bookName, String borrowerName, int returnDate) {
        for (Book book : books) {
            if (book.getName().equals(bookName) && book.getBorrowerName().equals(borrowerName)) {
                if (returnDate > book.getDueDate()) {
                    try {
                        throw new BookReturnException(bookName, borrowerName, book.getDueDate());
                    } catch (BookReturnException e) {
                        System.out.println("Error: " + e.getMessage());
                        return;
                    }
                }
                books.remove(book);
                System.out.println("Book '" + bookName + "' returned by " + borrowerName);
                return;
            }
        }
        System.out.println("Error: Book not found or not borrowed by " + borrowerName);
    }
}

public class EH2 {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook("Book1", "User1", 10);
        library.returnBook("Book1", "User1", 11); // Late return
    }
}
