import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        Man[] men = new Man[n*2+1];
        Woman[] women = new Woman[n*2+1];

        men[1] =  new Man("Ross", 1, new int[]{6, 4, 2}) ;
        men[3] =  new Man("Chandler", 3, new int[]{2, 6, 4});
        men[5] =  new Man("Joey", 5, new int[]{6, 4, 2}) ;

        women[2] = new Woman("Monica", 2, new int[]{3, 5, 1});
        women[4] =  new Woman("Phoebe", 4, new int[]{5, 1, 3});
        women[6] = new Woman("Rachel", 6, new int[]{1, 5, 3});

        Queue<Man> manQueue = new LinkedList<>();

        for(Man man : men) {
            if(man != null) {
                manQueue.add(man);
            }
        }

        while( !manQueue.isEmpty() ){
            Man man = manQueue.poll();

            int wId = man.getMostPreferedWoman();
            Woman woman = women[wId];
            if( !woman.hasAHusband() ) {
                woman.setHusband(man.getId());
            } else if( woman.newHusbandIsBetter(man.getId()) ) {
                manQueue.offer( men[woman.getHusband()] );
                woman.setHusband(man.getId());
            } else {
                manQueue.offer(man);
            }
        }

        for(Woman w : women) {
            if(w != null)
                System.out.println(men[w.getHusband()].getName() + " -- " + w.getName());
        }


    }
}
