import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by andre on 2018-03-21.
 */
public class WomanTest {

    Woman woman;

    @Before
    public void setUp() throws Exception {
        woman = new Woman("Monica", 2, new int[]{3, 5, 1});
    }

    @Test
    public void arrayShouldBeInvertedCorrectly() throws Exception {
        int[] expected = new int[]{0, 3, 0, 1, 0, 2, 0};
        assertArrayEquals(expected, woman.preferences);
    }

    @Test
    public void newHusbandShouldBeBetter() throws Exception {
        woman.setHusband(5);
        assertTrue("False when should be true", woman.newHusbandIsBetter(3));
    }

    @Test
    public void newHusbandShouldBeWorse() throws Exception {
        woman.setHusband(5);
        assertFalse("True when should be false", woman.newHusbandIsBetter(1));
    }

}
