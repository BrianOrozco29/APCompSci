package exercises8.blah;
import java.util.Scanner;
public class Exercise10 {
	public static boolean isAbecedarian(String s) {
	char a = 'a';
		for (int i = 0; i < s.length(); i++) 
		{
			while (s.charAt(i) != a) 
			{
				a++;
					if (a == '{') // '{' comes after 'z'
					{
						return false;
					}
			}
		}
		return true;
	}
		
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String a = abc.nextLine();
		System.out.print(isAbecedarian(a));
		}
}
