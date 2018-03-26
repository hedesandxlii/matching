import com.sun.xml.internal.bind.v2.TODO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    /**
     * All indexing is treated like person ID - 1 because person ID starts from 1   (╯°□°）╯︵ ┻━┻
     */
    Man[] men = new Man[250];
    Woman[] women = new Woman[250];
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
        boolean readingPeople = true;
        String[] people = new String[500]; // TODO: 2018-03-26  size?!?!?!
        int i = 0;
        while(readingPeople) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                readingPeople = false;
            } else {
                String[] numberName = line.split(" ");
                //int number = Integer.parseInt(numberName[0]);
                String name = numberName[1];
                people[i] = name;
                System.out.println((i + 1) + name);
                i++;
            }

        }
        // TODO: 2018-03-26 preferences
        readPreferences(scanner);



        fillMenWomen(people);
    }

    private int[] readPreferences(Scanner scanner) {

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

        }
        return null;
    }

    private void fillMenWomen(String[] people) {

        int i = 0;
        do {
            //men[i] = new Man();
            i++;
            //women todo

            i++;
        } while (people[i] != null);
    }
}
