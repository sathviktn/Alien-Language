//package translator;
                                   //prgm to alien lang a=d ie a+3
import java.util.*;                //sath
                                  //In this , we make ascii values of given string, add them and turn them back to String 
public class Alien_lang {
	public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter String");
    String S = new String(s.next());     //reading string
    byte  c[] = S.getBytes();           //c gets bytes of string S
    int i,a, n = c.length;
    for(i=0;i<n;i++)
    {
        a = c[i];                        //a gets ascii
        a =  a+3;                    //a got 3 +
       c[i] = (byte) a;                 //type cast int to bytes ...no change in numbers will occur
    }
    String A = new String(c);   //in order to convert bytes to string u must create new and assign as follows
    System.out.print(A);
  }
}