package CTCI.DS;

/**
 * Created by srbkr on 3/13/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStacks {
    public static void main(String[] args) {
        class MyQueue<Integer>{
            Stack<Integer> A,B;
            public MyQueue(){
                A= new Stack();
                B= new Stack();
            }
            public void enqueue(Integer n){
                A.push(n);
            };
            public Integer dequeue(){
                if(!B.isEmpty())
                    return B.pop();
                else{
                    while(!A.isEmpty())
                        B.push(A.pop());
                    return B.pop();
                }

            }
            public Integer peek(){
                if(!B.isEmpty())
                    return B.peek();
                else {
                    while(!A.isEmpty())
                        B.push(A.pop());
                    return B.peek();
                }

            }
        }
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
