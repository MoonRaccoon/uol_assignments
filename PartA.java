// Name: Shamoun Syed
// Student Number: 140313701

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
        /* This for loop appears to iterate a sufficiently high number of times in order to demonstrate the
         * randomness of the magic8ball() method. There is a good chance of each possibility appearing at least once,
         * and without any specific order.
         * */
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

   static String censor(String str) {
        String returnString = "";

        for(int i = 0; i < str.length(); i++) {
            returnString += "*";
        }

        return returnString;
    }

   static void print(String str) {
       System.out.println(str);
   }

   static String magic8Ball() {
       Random generator = new Random();
       return answers[generator.nextInt(answers.length)];
   }

   static String[] drawStars(int w, int l) {
       String[] starsArray = new String[l];
       String starsWidth = "";

       for(int n = 0; n < w; n++) {
               starsWidth += "*";
           }

       for(int i = 0; i < l; i++) {
           starsArray[i] = starsWidth;
       }

       return starsArray;
   }

   static void print(String[] s) {
       for(int k = 0; k < s.length; k++) {
           System.out.println(s[k]);
       }
   }

}


