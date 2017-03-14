package CTCI.Algorithms;

import java.util.Comparator;

/**
 * Created by srbkr on 3/13/2017.
 */

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a,  Player b){
        //  Player a=(Player)A;
        //  Player b=(Player)B;
        if(a.score!=b.score)
            return b.score-a.score;
        else
            return a.name.compareTo(b.name);
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

