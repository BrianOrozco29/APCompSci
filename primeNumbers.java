package simplePrograms;

public class primeNumbers {

	public static void main(String[] args) {
		//Prime Numbers of 1 to 1000
		int i;
		int x;
		int counter = 0;
		System.out.println("2" + " is a prime number");
			for (i=1; i <= 1000; i++)
			{
				for (x=2; x<=i; x++)		
					{	
						if ((i%x) == 0)
						{
						break;
						 
						}
						else if (x == i-1)
						{
						System.out.println(i + " is a prime number");
						counter++;
						}
					}
			}
		System.out.println("From 1 to 1000, there are " + (1+counter) + " prime numbers." );
}
}
