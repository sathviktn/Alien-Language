package translator;

import java.util.*;

public class Vowels {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);	
    String word = new String();
    System.out.println("Enter the Word: ");
    word = s.next();
    char[] Word = word.toCharArray();
    for(int i=0;i<Word.length;i++) {
	switch(Word[i])
	{
	case 'a' : System.out.print("@");
	          break;
	case 'e' : System.out.print("5");
    	      break;
	case 'i':  System.out.print("1");
			  break;
	case 'o' : System.out.print("0");
    		  break;
	case 'u' : System.out.print("^");
    		  break;
	case '0' : System.out.print("^");
	  		  break;
	case '1' : System.out.print("^");
	         break;
	case '4' : System.out.print("^");
	  		   break;
    default : System.out.print(Word[i]);
    	    break;
	}
    }
}
}