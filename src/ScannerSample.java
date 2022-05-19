import java.util.*;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the First name :");
        String firstName = scanner.next();
        System.out.println("Enter the Last name :");
        String lastName = scanner.next();
        System.out.println("Enter the Age:");
        int age = scanner.nextInt();
        System.out.println("Enter the Salary:");
        double salary = scanner.nextDouble();

        System.out.println("First Name is :" +firstName);
        System.out.println("Last Name is :" +lastName);
        System.out.println("Age is :" +age);
        System.out.println("Salary is :" +salary);
	}
}

