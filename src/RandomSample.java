import java.util.Random;

public class RandomSample {
	
	public static void main (String args) {
		
		Random random = new Random();
		int rand = random.nextInt(25);
		System.out.println("The Random number is:" +rand);
	}
}