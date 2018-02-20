package HackerRankStringPblmStatements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pangram {

	public static void main(String[] args) {
		
		String str = "We promptly judged antique ivory buckles for the next prize ";
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
        
    	HashSet set = new HashSet<>();
        for(int i=0; i<str.length(); i++)
        {
        	set.add(str.charAt(i)) ;
        	if(set.size() == 26)
        		{
        		   System.out.println("pangram");
        		   System.exit(0);
        		}
        }
			
		System.out.println("not pangram");

	}

}
