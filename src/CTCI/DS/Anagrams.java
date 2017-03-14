package CTCI.DS;

/**
 * Created by srbkr on 3/13/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams {
    public static int numberNeeded(String first, String second) {
        int[] map= new int[26];
        for(char c:first.toCharArray()){
            map[c-'a']++;
        }
        int count=0;
        for(char c:second.toCharArray()){
            if(map[c-'a'] > 0){
                map[c-'a']--;
                count++;
            }
        }
        return first.length()+second.length()-2*count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
