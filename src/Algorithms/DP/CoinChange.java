package Algorithms.DP;
import javafx.util.Pair;

import java.io.*;
import java.util.*;

/**
 * Created by srbkr on 3/8/2017.
 */
public class CoinChange {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner s= new Scanner(System.in);
        int N= s.nextInt();
        int m=s.nextInt();
        int i=0;
        int[] M= new int[m];
        while(i<m){
            M[i++]=s.nextInt();
        }

        System.out.println(coinChange(N,M));

    }
    public static long coinChange(int N, int[] M){
        HashMap<Pair<Integer,Integer>,Long> map= new HashMap<>();

        return helper(N,map,M,0);
    }
    public static long helper(int i, HashMap<Pair<Integer,Integer>,Long> map, int[] M, int j){
        if(i<0) return 0;
        if(i==0) return 1;
        if(j== M.length) return 0;

        if(!map.containsKey(new Pair<Integer,Integer>(i,j)))
        {
            long val= helper(i-M[j],map,M,j) + helper(i,map,M,j+1);
            map.put(new Pair<Integer,Integer>(i,j),val);
        }

        return map.get(new Pair<Integer,Integer>(i,j));
    }
}
