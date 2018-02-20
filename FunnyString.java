package HackerRankStringPblmStatements;

import java.util.Scanner;

public class FunnyString {

	   static String funnyString(String s){
		   
		   /* if(s.length()%2 != 0 ) return "Not Funny";
		    for(int i=1; i<s.length()/2; i++)
		    {
		    	  int diff1=0,diff2=0;
		    	  
		          diff1=s.charAt(i)-s.charAt(i-1);
		          
		          if(diff1<0) diff1*=-1;
		          
		          diff2=s.charAt(s.length()-i)-s.charAt(s.length()-1-i);
		          
		          if(diff2<0) diff2*=-1;
		          
		          if(diff1!=diff2){
		              return "Not Funny";
		    	
		    }
		    2
acxz
bcxz
	        
		    }*/
		   
		   StringBuffer sb = new StringBuffer(s);
		   sb = sb.reverse();
	 
		   boolean b = true;
		   for(int i=1; i<s.length(); i++){
			   if(Math.abs(s.charAt(i)-s.charAt(i-1)) != Math.abs(sb.charAt(i)-sb.charAt(i-1))){
				   b = false; break;}
		   }
		   if(b == true) return "Funny";
		   else return "Not Funny";
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            String result = funnyString(s);
	            System.out.println(result);
	        }
	    }

}
