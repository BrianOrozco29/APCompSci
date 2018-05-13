package arrays;
import java.util.Scanner;
public class tests {
	private static Scanner math = new Scanner(System.in);
	private static int i, a;
	private static int sum;
	private static int[] test = new int[5];
	public static double Total (){
		System.out.println("Please enter test scores: ");
		for (i=0; i<=test.length - 1; i++){
			test[i] = math.nextInt();
			sum += test[i];
		}
		return sum;
	}
	public static double average() {
		a = sum/test.length;
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println(Total());
		System.out.println(average());
		
	}
	
	
}
