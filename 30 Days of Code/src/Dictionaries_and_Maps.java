import java.util.*;
import java.io.*;

public class Dictionaries_and_Maps {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> PhoneBook = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            PhoneBook.put(name, String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            if (!PhoneBook.containsKey(s)) {
            	System.out.println("Not found");
            } else {
            	System.out.println(s + "=" + PhoneBook.get(s));
            }
        }
        in.close();

    }
}
