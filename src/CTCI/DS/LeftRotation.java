package CTCI.DS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        k=k%n;
        if(k==0) return a;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[(i+n-k)%n]=a[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}