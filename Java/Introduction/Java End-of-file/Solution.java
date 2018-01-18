import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Solution {

    public static void main(String[] args) {
        int line = 0;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            line++;
            String s = scan.nextLine();
            System.out.println(line + " " + s);
        }
        scan.close();
    }
}
