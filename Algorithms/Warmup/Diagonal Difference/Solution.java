import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/diagonal-difference/problem
public class Solution {
    static int diagonalDifference(int[][] a) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int i, j;
        for (i = 0, j =  0; j < a[0].length; i++, j++) {
            primaryDiagonal += a[i][j];
        }
        
        for (i = 0, j = a.length - 1; j >= 0;i++, j--) {
            secondaryDiagonal += a[i][j];
        }
        int result = primaryDiagonal - secondaryDiagonal;
        if (result < 0) return -result;
        else return result;  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
