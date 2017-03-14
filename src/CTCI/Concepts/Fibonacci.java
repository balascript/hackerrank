package CTCI.Concepts;

/**
 * Created by srbkr on 3/13/2017.
 */
import java.util.*;

public class Fibonacci {


    public static int fibonacci(int n) {
        // Complete the function.
        int f1=1,f2=0;
        if(n==0)
            return f2;
        if(n==1)
            return f1;
        int f=0;
        for(int i=2;i<=n;i++){
            f=f1+f2;
            f2=f1;
            f1=f;
        }
        return f;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
