import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        
        int begin = 0;
        int end = A.length() - 1;
        
        if(begin == end) System.out.println("Yes");
        while (begin < end) {
            if(A.charAt(begin) != A.charAt(end)) {
                System.out.println("No");
                break;
            }
            begin++;
            end--;
            if(begin >= end) System.out.println("Yes");
        }
    }
}
