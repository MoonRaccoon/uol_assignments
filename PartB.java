// Name: Shamoun Syed
// Student Number: 140313701

import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String name = "";

		System.out.print("Enter a number> ");
		num = scanner.nextInt();
		scanner.nextLine();

        /* When we call the nextInt() method, the scanner waits for us to type an int
         * and hit the enter/return key. When we do so, the scanner consumes the integer character,
         * but not the line separator character. The scanner is now positioned after the int, but before the
         * line separator. If we call scanner.nextLine() immediately after, it will consume everything between
         * the current position and the next line separator, and advance the scanner position just beyond it, effectively
         * removing the line separator. If we do not, we go right ahead and assign this empty value of scanner.nextLine()
         * to the String name, and attempt to call name.charAt(0). This fails, because there was nothing between the scanner
         * position and the next line separator after calling nextInt().
         * */

		System.out.println("You entered '" + num + "'. " + num + "x2 = " + num*2);

		System.out.print("What's your name? ");
		name = scanner.nextLine();

		System.out.println("Hello " + name + "! Your name starts with the letter " + name.charAt(0) + ".");

		scanner.close();
	}
}
