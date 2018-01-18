import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/staircase/problem
public class Solution {
    static void staircase(int n) {
        int spaces = n - 1;
        for (int i = 1; i <= n; i ++) {
            for(int j = 0; j < spaces; j++) {System.out.print(" ");}
            spaces--;
            for(int k = 0; k < i; k++) {System.out.print("#");}
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
