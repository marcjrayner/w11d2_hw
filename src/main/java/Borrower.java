import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int countBooks() {
        return borrowedBooks.size();
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }


    public void borrow(Library library, Book book) {
        Book bookToBorrow = library.removeBook(book);
        borrowedBooks.add(bookToBorrow);
    }
}
