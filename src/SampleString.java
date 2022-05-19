
public class SampleString {

	public static void main(String[] args) {

		String name = "Hemnath G";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.equalsIgnoreCase("hemnath g"));
		System.out.println(name.contentEquals("Hemnath G"));
		System.out.println(name.replace("G", "Gunasekaran"));
		String message = " Hello World  ";
		System.out.println(message.trim());
	}
}