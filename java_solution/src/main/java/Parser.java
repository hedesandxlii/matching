import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    private Scanner scanner = null;
    String[] men;
    String[] women;
    Man[] vectorOfMen;
    Woman[] vectorOfWomen;

    public int readN() {
        File file = new File("testfiles/sm-friends.in");

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.nextLine();
        scanner.nextLine();
        return Integer.parseInt(scanner.nextLine().substring(2));
    }

    public void makePersonVector(int n) {
        men = new String[n];
        women = new String[n];
        for (int i = 0; i<n; i++) {
            men[i] = scanner.nextLine().split(" ")[1];
            women[i] = scanner.nextLine().split(" ")[1];
        }
        scanner.nextLine();
    }


    public int[][] preferences(int n) {
        int[][] result = new int[n*2][n-1];
        for (int i = 0; i < n*2; i++) {
            String[] line = scanner.nextLine().split(" ");
            int[] row = new int[n];
            for (int j = 0; j< n;j++) {
                row[j] = Integer.parseInt(line[j+1]);
            }
            result[i] = row;
        }
        
        return result;
    }

    public void fillMenAndWomen(int n, String[] men, String[] women, int[][] preferences) {
        vectorOfMen = new Man[n];
        vectorOfWomen = new Woman[n];
        for (int i = 0; i < n*2; i++) {
            if (i%2==0) { //case man
                vectorOfMen[i/2] = new Man(men[i/2],i+1,preferences[i]);
                System.out.println(vectorOfMen[i/2].getId()+vectorOfMen[i/2].getName()+vectorOfMen[i/2].preferences[0]+vectorOfMen[i/2].preferences[1]+vectorOfMen[i/2].preferences[2]);
            } else { //case woman
                vectorOfWomen[i/2] = new Woman(women[i/2], i + 1, preferences[i]);
                System.out.println(vectorOfWomen[i/2].getId()+vectorOfWomen[i/2].getName()+vectorOfWomen[i/2].preferences[0]+vectorOfWomen[i/2].preferences[1]+vectorOfWomen[i/2].preferences[2]);
            }
        }
    }
}
