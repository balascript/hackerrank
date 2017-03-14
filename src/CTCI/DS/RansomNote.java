package CTCI.DS;

/**
 * Created by srbkr on 3/13/2017.
 */
import java.util.*;

public class RansomNote {
    HashMap<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String n=null;
    public RansomNote(String magazine, String note) {
        magazineMap=new HashMap();
        n=note;
        for(String s: magazine.split(" ")){
            magazineMap.put(s,(magazineMap.containsKey(s)?magazineMap.get(s):0)+1);
        }


    }

    public boolean solve() {
        if(n==null || n.length()==0) return true;
        if(magazineMap.size()==0) return false;

        for(String c: n.split(" ")){
            if(!magazineMap.containsKey(c) || magazineMap.get(c)==0) return false;
            magazineMap.put(c,magazineMap.get(c)-1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

