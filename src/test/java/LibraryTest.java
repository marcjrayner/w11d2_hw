import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library myLibrary;

    @Before
    public void before() {
        myLibrary = new Library();
    }

    @Test
    public void hasBooksArrayList() {
        assertEquals(0, myLibrary.countBooks());
    }


}
