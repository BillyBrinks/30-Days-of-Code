import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Given an integer n, convert n to binary and print
 * out the longest consecutive stream of 1's in n's
 * binary representation.*/

public class Day10_Binary {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //convert
        String s =  Integer.toBinaryString(n);
        
        //set up counters
        int count = 0; 
        int longestString = 0; 

        //count
        for (int i = 0; i < s.length(); i++){
          if (s.charAt(i) == '1'){
              count++; 
              if (i == s.length() - 1 && count > longestString){
                  longestString = count;
              }
          } else {
              if (longestString < count){
                  longestString = count;
                  count = 0; 
              }
              count = 0;
          }
        }

        System.out.println(longestString);
        scanner.close();
    }
    
}
