import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Library myLibrary;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        borrower1 = new Borrower("Jim");
        myLibrary = new Library();
        book1 = new Book("Harry Potter", "JK Rowling", "Teen");
        book2 = new Book("Harry Potter Cursed Child", "JK Rowling", "Teen");
    }

    @Test
    public void booksCollectionStartsEmpty() {
        assertEquals(0, borrower1.countBooks());
    }

    @Test
    public void canAddBookToBorrowedBooks() {
        borrower1.addBook(book1);
        assertEquals(1, borrower1.countBooks());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        borrower1.borrow(myLibrary, book2);
        assertEquals(1, borrower1.countBooks());
        assertEquals(1, myLibrary.countBooks());
    }
}
