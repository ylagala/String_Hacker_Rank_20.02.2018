package HackerRankStringPblmStatements;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TwoCharacterString {

	  static int twoCharaters(String s) {
		  s.trim().split("[a-z]{}");
		
		return s.length();
	    }

	    public static void main(String[] args) {
	        //Scanner in = new Scanner(System.in);
	        int l = 10;
	        String s = "beabeefeab";
	        int result = twoCharaters(s);
	        System.out.println(result);
	        //in.close();
	    }

}
