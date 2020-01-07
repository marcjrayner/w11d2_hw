import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Library myLibrary;
    private Book book1;

    @Before
    public void before() {
        borrower1 = new Borrower("Jim");
        myLibrary = new Library();
        book1 = new Book("Harry Potter", "JK Rowling", "Teen");
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


}
