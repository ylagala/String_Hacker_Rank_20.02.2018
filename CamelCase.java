package HackerRankStringPblmStatements;

import java.util.Scanner;

public class CamelCase {

	   static int camelcase(String s) {
		    String[] str = s.trim().split("[A-Z]");
		    int count = str.length;
		  
			return count;
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int result = camelcase(s);
	        System.out.println(result);
	        in.close();
	    }

}
