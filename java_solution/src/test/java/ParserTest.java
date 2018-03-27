import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    Parser parser;
    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void testReadN() {
        assertEquals(3, parser.readN());
    }

    @Test
    public void testMakePersonVector() {
        int n = parser.readN();
        parser.makePersonVector(n);

    }

    @Test
    public void testPreferences() {
        int n = parser.readN();
        parser.makePersonVector(n);
        parser.preferences(n);
    }

    @Test
    public void testFillMenAndWomen() {
        int n = parser.readN();
        parser.makePersonVector(n);
        parser.fillMenAndWomen(n,parser.men,parser.women,parser.preferences(n));
    }
}
