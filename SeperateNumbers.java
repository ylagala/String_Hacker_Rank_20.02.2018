package HackerRankStringPblmStatements;

import java.util.Scanner;

public class SeperateNumbers {

	static void separateNumbers(String s) {
		boolean valid = false;
		long l1 =0;
		int length = s.length() /2 ;
		for(int i=1; i<=length; i++)
		{
			StringBuilder sb = new StringBuilder();
			long l = Long.parseLong(s.substring(0,i));
			 l1 = l;
			sb.append(l); 
			while(sb.length() < s.length()) 
			{
				sb.append(++l); 
			}
			
			if(s.equals(sb.toString()))
			{
				valid = true; 
				break;
			}
		}
		if(valid) System.out.println("YES "+l1);
		else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}
