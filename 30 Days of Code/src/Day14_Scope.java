import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] arr){
        //super(elements, maximumDifference);
        this.elements = arr;
        this.maximumDifference = 0; 
    }

    void computeDifference(){
        int[] arr = this.elements;
        int biggestDifference = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (Math.abs(arr[i] - arr[j]) > biggestDifference){
                    biggestDifference = Math.abs(arr[i] - arr[j]);
                }
            }
        }

        maximumDifference = biggestDifference;
    }
} // End of Difference class

public class Day14_Scope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
