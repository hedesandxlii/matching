/**
 * Created by andre on 2018-03-21.
 */
public class Woman extends Person{

    private int currentHusband;

    public Woman(String name, int id, int[] preferences) {
        super(name, id, invertArray(preferences));
        currentHusband=0; // since persons starts at 1, this is a placeholder.
    }

    public void setHusband(int id) {
        currentHusband = id;
    }
    public int getHusband() {
        return currentHusband;
    }

    public boolean hasAHusband() {
        return currentHusband != 0;
    }

    public boolean newHusbandIsBetter(int idOfNew) {
        int currentScore = preferences[currentHusband];
        int newScore = preferences[idOfNew];
        return currentScore > newScore;
    }

    private static int[] invertArray(int[] a) {
        int[] inverted = new int[2*a.length+1];
        int i = 1;
        for(int elem : a) {
            inverted[elem] = i;
            i++;
        }
        return inverted;
    }
}
