package CTCI.DS;

/**
 * Created by srbkr on 3/13/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Brackets {

    public static boolean isBalanced(String expression) {
        if(expression.length()==0) return true;
        Stack<Character> stk= new Stack();
        char[] c= expression.toCharArray();
        for(char a:c){
            if(a=='(')
                stk.push(')');
            else if(a=='{')
                stk.push('}');
            else if(a=='[')
                stk.push(']');
            else {
                if (stk.isEmpty() || a!=stk.pop())
                    return false;
            }

        }
        return (stk.isEmpty());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
