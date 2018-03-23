import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andre on 2018-03-21.
 */
public class ManTest {

    Man fixt;
    @Before
    public void setUp() {
        fixt = new Man( "Ross", 1, new int[]{6,4,2} );
    }

    @Test
    public void shouldTraversePrefferedListCorrectly() throws Exception {
        int first = fixt.getMostPreferedWoman();
        int second = fixt.getMostPreferedWoman();
        int third = fixt.getMostPreferedWoman();
        int result = fixt.getMostPreferedWoman();

        assertEquals("First element wrong", 6, first);
        assertEquals("Second elem. wrong", 4, second);
        assertEquals("Third elem wrong", 2, third);
        assertEquals("Empty list returns wrong value", -1, result);
    }
}
