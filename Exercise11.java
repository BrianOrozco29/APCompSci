package exercises8.blah;
import java.util.Scanner;
public class Exercise11 {

	 public static boolean isDupledrome(String a) {
	        
		 int length = a.length();
     
         // can't be a dupledrome if s has odd number of letters
         if (length%2 != 0) {
                 return false;
         }
         
        
         for (int index = 0; index < length; index += 2) {
                 if (a.charAt(index) != a.charAt(index + 1)) {
                         return false;
                 }
       
         }
         return true;

	 }

	 public static void main(String[] args){
		 Scanner dupl = new Scanner(System.in);
		String s = dupl.nextLine();
		 System.out.println(isDupledrome(s));
		 System.out.println(5 + 19);
	 }
	
}

