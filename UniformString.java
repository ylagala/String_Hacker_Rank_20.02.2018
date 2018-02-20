package HackerRankStringPblmStatements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s + " ";
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            list.add(x);
            
        }
        
        
        HashSet hs = new HashSet<>();
        for(int i=0; i<s.length()-1; i++)
        {
        	if(s.charAt(i) == s.charAt(i+1))
        	{
        		Integer temp = (int) s.charAt(i) -96;
        		hs.add(temp);
        		
        		while(s.charAt(i) == s.charAt(i+1)){
        			temp = temp + s.charAt(i)-96;
        			hs.add(temp);
        			i++;
        		}
        		
        	}
        	else{
        		Integer temp1 = (int) s.charAt(i) -96;
        		hs.add(temp1);
        	}
        	
        }
        for(Integer i : list)
        {
        	if(hs.contains(i))
        	{
        		System.out.println("Yes");
        	}
        	else
        		System.out.println("No");
        }
       
        
    }
}
