import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class Solution {
    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 0;
        int sum = 0;
        for(int x : ar) max = x > max ? x : max;
        for(int x : ar) if(x == max) sum++;
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
