import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before() {
        book1 = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Hobbit", book1.getTitle());
    }



}
