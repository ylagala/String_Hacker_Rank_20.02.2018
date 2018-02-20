package HackerRankStringPblmStatements;

import java.util.Scanner;

public class SuperReducedString {

	   static String super_reduced_string(String str){
	        	   for (int i = 1; i < str.length(); i++) {
	                if (str.charAt(i) == str.charAt(i-1)) {
	                    str = str.substring(0, i-1) + str.substring(i+1);
	                    i = 0;
	                }
	            }
	        	   
	        	   if(str.length() == 0)
	        		   str = "Empty String" ; 
	        
			return str;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = super_reduced_string(s);
	        System.out.println(result);
	    }
}
