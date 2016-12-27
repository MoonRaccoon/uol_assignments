import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String name = "";

		System.out.print("Enter a number> ");
		num = scanner.nextInt();
//		scanner.nextLine();

		System.out.println("You entered '" + num + "'. " + num + "x2 = " + num*2);

		System.out.print("What's your name? ");
		name = scanner.nextLine();

		System.out.println("Hello " + name + "! Your name starts with the letter " + name.charAt(0) + ".");

		scanner.close();
	}
}
