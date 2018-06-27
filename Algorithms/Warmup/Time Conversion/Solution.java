import java.io.*;
import java.util.*;

public class Solution {
    static String timeConversion(String s) {
        int hh, mm, ss;
        char ampm = s.charAt(8);
        StringBuilder stringBuilder = new StringBuilder();
        hh = Integer.parseInt(s.substring(0, 2));
        mm = Integer.parseInt(s.substring(3, 5));
        ss = Integer.parseInt(s.substring(6, 8));
        if(ampm == 'A') {
            switch (hh) {
                case 10: case 11:
                    stringBuilder.append(hh).append(":");
                    break;
                case 12:  stringBuilder.append("00:");
                    break;
                default: stringBuilder.append(0).append(hh).append(":");
                    break;
            }
        }
        else if(ampm == 'P') {
            if(hh != 12) hh += 12;
            stringBuilder.append(hh).append(":");
        }
        if(mm < 10) { stringBuilder.append(0); }
        stringBuilder.append(mm).append(":");
        if(ss < 10) { stringBuilder.append(0); }
        stringBuilder.append(ss);
        s = stringBuilder.toString();
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
