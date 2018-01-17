import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine(); // because the last newline character for that line of double input is still
                                    // queued in the input buffer
        s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
