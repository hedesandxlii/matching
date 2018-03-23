/**
 * Created by andre on 2018-03-21.
 */
public class Person {
    private String name;
    private int id;
    protected int[] preferences;

    public Person(String name, int id, int[] preferences) {
        this.name = name;
        this.id = id;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
