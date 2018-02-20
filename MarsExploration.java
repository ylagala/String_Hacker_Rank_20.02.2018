package HackerRankStringPblmStatements;

import java.util.concurrent.Semaphore;

public class MarsExploration {

    static int marsExploration(String s) {
    	
    	String sos = "SOS";
        int count =0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	char c1 = sos.charAt(i % 3);
            if (c != c1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String s = "SOSSPSSQSSOR";
        int result = marsExploration(s);
        System.out.println(result);
       // in.close();
    }

}
