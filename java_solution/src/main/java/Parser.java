import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    Man[] men;
    Woman[] women;
    int n;
    public void parseData(String filepath) {
        File f = new File(filepath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("could not find file");
        }
        scanner.nextLine();
        scanner.nextLine();
        n = Character.getNumericValue(scanner.nextLine().charAt(2));
        boolean readingMen = true;
        while(readingMen) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                readingMen = false;
            } else {
                String[] numberName = line.split(" ");
                int number = Integer.parseInt(numberName[0]);
            }

        }
    }
}
