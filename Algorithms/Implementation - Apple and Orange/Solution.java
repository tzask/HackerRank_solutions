import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/apple-and-orange/problem
public class Solution {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        int result[] = {0, 0};
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] > 0 && apple[i] >= s - a && apple[i] <= t - a) {
                result[0]++;
            }
        }
        for (int i = 0; i < orange.length; i++) {
            if (orange[i] < 0 && orange[i] <= t - b && orange[i] >= s - b) {
                result[1]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

        in.close();
    }
}
