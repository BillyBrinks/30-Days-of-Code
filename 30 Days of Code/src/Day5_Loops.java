import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5_Loops {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int product = 0; 
        for (int i = 1; i <= 10; i++){
            product = n*i;
            System.out.println(n + " x " + i + " = " + product);
        }

        scanner.close();
    }
}