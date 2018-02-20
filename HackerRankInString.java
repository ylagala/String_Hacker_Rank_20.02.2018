package HackerRankStringPblmStatements;

import java.util.Scanner;

public class HackerRankInString {

	static String hackerrankInString(String s) {
       String str = "hackerrank";
       int length = s.length();
       
       if(s.length() < str.length()) return "NO";
       
       int j = 0;
       for(int i=0; i<length; i++){
    	   char c= s.charAt(i);
    	   char c1=str.charAt(j);
    	   if(j < str.length() && (c==c1)){
    		   j++;
    	   }
    	   
       }
       
       return (j == str.length() ? "YES" : "NO");
   }

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int q = in.nextInt();
       for(int a0 = 0; a0 < q; a0++){
           String s = in.next();
           String result = hackerrankInString(s);
           System.out.println(result);
       }
       in.close();
   }
}
