/**
 * Created by andre on 2018-03-21.
 */
public class Man extends Person{
    boolean[] womenPorposedTo;

    public Man(String name, int id, int[] preferences) {
        super(name, id, preferences);
        womenPorposedTo = new boolean[preferences.length*2+1];
    }

    public int getMostPreferedWoman() {
        int res = -1;
        for(int i =0; i<preferences.length; i++) {
            if(womenPorposedTo[i]) {
                continue;
            }
            womenPorposedTo[i]=true;
            res = preferences[i];
            break;
        }
        System.out.println(getName() + " thinks " + res + " is the nicest");
        return res; //this shouldn't happend, right?
    }
}
