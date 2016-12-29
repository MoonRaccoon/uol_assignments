import java.util.Scanner;

public class TaxAdvisor {

    static double salary;
    static double allowance;
    static String registeredBlind;
    static String uniformWorker;
    static String homeWorker;
    static boolean noAllowance = false;
    static double basicTax;
    static double higherTax;
    static double additionalTax;
    static double totalTax;

    public static void main(String[] args) {
        breakdown();
    }

    static void userPrompt() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your yearly salary?");
        salary = input.nextDouble();

        if (salary < 122000) {
            System.out.println("Are you a registered blind person?");
            registeredBlind = input.next().toLowerCase();

            System.out.println("Are you a manual worker, or are you required to wear a uniform to work?");
            uniformWorker = input.next().toLowerCase();

            System.out.println("Do you work exclusively from home?");
            homeWorker = input.next().toLowerCase();
        }
        else {
            noAllowance = true;
        }
    }

    static boolean positiveAnswer(String answer) {
        return (answer.charAt(0) == 'y');
    }

    static void calculateAllowance() {
        allowance += 11000;

        if (positiveAnswer(registeredBlind)) {
            allowance += 2290;
        }
        if (positiveAnswer(uniformWorker)) {
            allowance += 60;
        }
        if (positiveAnswer(homeWorker)) {
            allowance += 200;
        }
    }

    static void calculateBasicTax() {
        if (salary >= 0.01) {
            if (salary >= 43000.01) {
                basicTax = 0.20 * (43000 - allowance);
            }
            else {
                basicTax = 0.20 * (salary - allowance);
            }
        }
    }

    static void calculateHigherTax() {
        if (salary >= 43000.01) {
            if (salary > 150000) {
                higherTax = 0.40 * (150000 - 43000);
            }
            else {
                higherTax = 0.40 * (salary - 43000);
            }
        }
    }

    static void calculateAdditionalTax() {
        if (salary > 150000) {
            additionalTax = 0.45 * (salary - 150000);
        }
    }

    static void breakdown() {
        userPrompt();
        if (!noAllowance) {
            calculateAllowance();
        }
        calculateBasicTax();
        calculateHigherTax();
        calculateAdditionalTax();
        totalTax = basicTax + higherTax + additionalTax;

        System.out.println("Your salary is " + salary);
        System.out.println("Your tax allowance is " + allowance);
        System.out.println("You owe " +  basicTax + " in the first tax band (20% tax) "
                + "paid on taxable income up to 43,000");
        System.out.println("You owe " + higherTax + " in the second tax band (40% tax) "
                + "paid on taxable income above to 43,000 and up to 150,000");
        System.out.println("You owe " + additionalTax + " in the third tax band (45% tax) "
                + "paid on taxable income over 150,000");
        System.out.println("Total tax owed on your salary = " + totalTax);

    }

}
