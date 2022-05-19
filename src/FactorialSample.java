//import java.util.Scanner;

public class FactorialSample {

	static long fact(int num) {

		long factorial = 1;
		for (int k = 1; k <= num; k++)
			factorial = factorial * k;
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Number:");
		for (int i = 1; i <= 50; i++) {
			long result = fact(i);
			System.out.println(" Factorial of " + i + " is " + result);
		}
	}

}
