import java.util.Scanner;

public class Prime {

	static boolean isPrime(int num) {

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		boolean result = isPrime(num);
		System.out.println(result);
	}
}
