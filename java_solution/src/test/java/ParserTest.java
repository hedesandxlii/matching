import org.junit.Test;

public class ParserTest {
    @Test
    public void testReadFile() {
        Parser parser = new Parser();
        parser.parseData("/matching/java_solution/testfiles/sm-friends.in");
    }
}
