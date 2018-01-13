import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class Solution {
    static void miniMaxSum(long[] arr) {
        long sums[] = new long[arr.length];
        
        sums[0] = arr[1] + arr[2] + arr[3] + arr[4];
        sums[1] = arr[0] + arr[2] + arr[3] + arr[4];
        sums[2] = arr[1] + arr[0] + arr[3] + arr[4];
        sums[3] = arr[1] + arr[2] + arr[0] + arr[4];
        sums[4] = arr[1] + arr[2] + arr[3] + arr[0];
        
        long min = sums[0];
        long max = 0l;
        for (int i = 0; i < sums.length; i++) {
            min = sums[i] < min ? sums[i] : min;
            max = sums[i] > max ? sums[i] : max;
        }
            System.out.print(min + " " + max);            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }
}
