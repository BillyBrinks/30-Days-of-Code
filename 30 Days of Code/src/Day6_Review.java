import java.io.*;
import java.util.*;

public class Day6_Review {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStrings = scan.nextInt();
        String evens = "";
        String odds = "";

        for (int i = 1; i <= numStrings; i++){
            evens = "";
            odds = "";
            String s = scan.next();
            int length = s.length();

            for (int j = 0; j < length; j++){
                if (j%2 == 0){
                    evens += s.charAt(j);
                } else {
                    odds += s.charAt(j);
                }
            }

            System.out.println(evens + " " + odds);
        }

    }
}
