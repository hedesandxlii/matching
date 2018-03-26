import org.junit.Test;

public class ParserTest {
    @Test
    public void testReadFile() {
        Parser parser = new Parser();
        parser.parseData("testfiles/sm-friends.in");
    }
}
