import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] tokens = s.trim().split("[ !,?._'@]+");
        
        if(s.trim().length() == 0 || tokens.length == 0) System.out.println(0);
        else {
            System.out.println(tokens.length);
            for(String token : tokens) System.out.println(token);
        }
    }
}
