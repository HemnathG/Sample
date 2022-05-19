import java.util.Scanner;

public class Function {

	static int add(int num1, int num2) {
		int num = num1 + num2;
//		System.out.println(" Addition of " +num1 + " and " +num2 + " is " +num);
		return num;
	}

	static int subtraction(int num1, int num2) {
		int num = num1 - num2;
//		System.out.println(" Subtraction of " +num1 + " and " +num2 + " is " +num);
		return num;
	}

	static int multiplication(int num1, int num2) {
		int num = num1 * num2;
//		System.out.println(" Multiplication of " +num1 + " and " +num2 + " is " +num);
		return num;
	}

	static int division(int num1, int num2) {
		int num = num1 / num2;
//		System.out.println(" Division of " +num1 + " and " +num2 + " is " +num);
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scanner.nextInt();
		System.out.println("Enter number 2");
		int num2 = scanner.nextInt();

		System.out.println(
				"Press 1 for Addition, Press 2 for Subtraction, Press 3 for Multiplication, Press 4 for Division");
		System.out.println("Enter the function");
		int randomNumber = scanner.nextInt();

		switch (randomNumber) {

		case 1:
			int result = add(num1, num2);
			System.out.println("Addition is :" + result);
			break;

		case 2:
			result = subtraction(num1, num2);
			System.out.println(" Subtraction of " + num1 + " and " + num2 + " is " + result);
			break;

		case 3:
			result = multiplication(num1, num2);
			System.out.println(" Multiplication of " + num1 + " and " + num2 + " is " + result);
			break;

		case 4:
			result = division(num1, num2);
			System.out.println(" Division of " + num1 + " and " + num2 + " is " + result);
			break;

		default:
			System.out.println("Enter the Valid Option ");
		}

	}

}
