import java.util.Random;

public class PartA {

	static String[] answers = new String[] { "Without a doubt","Yes", "Concentrate and ask again", "Don't count on it",  "Very doubtful", "Outlook unclear" };

	public static void main(String[] args) {
		String c1 = censor("short");
		String c2 = censor("longer the short");
		String c3 = censor("the longest one we've got");

		print(c1);
		print(c2);
		print(c3);
		print("");

		for (int i = 0; i<20;i++){
			String m8ball1 = magic8Ball();
			print(m8ball1);
		}
		print("");

		String[] star1 = drawStars(10, 3);
		String[] star2 = drawStars(20, 10);
		String[] star3 = drawStars(30, 6);

		print(star1);
		print("");
		print(star2);
		print("");
		print(star3);
		print("");
	}
}


