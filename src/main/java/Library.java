import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int booksCapacity;

    public Library() {
        this.books = new ArrayList<Book>();
        this.booksCapacity = 3;
    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (!checkIfStockFull()) {this.books.add(book);}
    }

    public boolean checkIfStockFull() {
        if (books.size() == booksCapacity) {
            return true;
        }
        return false;
    }
}
