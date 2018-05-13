package exercises8.blah;
import java.util.Scanner;
public class Exercise9 {

		
		public static char first(String a) {
			return a.charAt(0); 
		}	//checks for one letter
		
		// last only works if s contains at least one letter
		public static char last(String a) {
			return a.charAt(a.length() - 1); 
		} //checks for last letter
		

		public static String middle(String a) {
			if (a.length() <= 2) {
				return ""; 
			}
			return a.substring(1, a.length() - 1);
		}	//returns middle characters
		
		public static boolean isPalindrome(String a) {
			if (a.length() <= 1) {
				return true; 
			}
			
			if (first(a) != last(a)) {
				return false;
			} 
			else {
				return isPalindrome(middle(a));
			} /*checks if the string is a palindrome. At this point, if a string is 2 letters, it will return false, unless the letters are the same, if it has only one letter it will return true, and if it has no letters the program will not go past the first condition*/
		}
		
		public static boolean isPalindromeIter(String a) {
			
			while (a.length() > 1) {
				if (first(a) != last(a)) {
					return false;
				}
				a = middle(a); 
			}
			return true;
		}	
		public static void main(String[] args) {
			Scanner pali = new Scanner(System.in);
			String a = pali.nextLine();
			System.out.println(first(a));
			System.out.println(last(a));
			System.out.println(middle(a));
			System.out.println(isPalindrome(a));
			System.out.println(isPalindromeIter(a));
		}
	}

