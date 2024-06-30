package CSC320.CSC320_CTA3_aale12;

import java.util.Scanner; //Import the Scanner class

public class CTA3_Option1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your weekly income");

        double userIncome = scnr.nextDouble();
        double tax = 0;
        int taxBracket = 10;
        //System.out.println("Inputted weekly income is:" + userIncome);

        if (userIncome < 500) {
            tax = userIncome * 0.10;
            //taxBracket = 10;
        } else if (userIncome >= 500 && userIncome < 1500) {
            tax = userIncome * 0.15;
            taxBracket = 15;
        } else if (userIncome >= 1500 && userIncome <2500) {
            tax = userIncome * 0.20;
            taxBracket = 20;
        } else if (userIncome >= 2500) {
            tax = userIncome * 0.30;
            taxBracket = 30;
        }

        double total = userIncome - tax;
        System.out.println("The weekly tax for an income of $" + String.format("%.2f", userIncome) + " is $" + String.format("%.2f", tax) + " (" + taxBracket + "%)");
        System.out.println("The total amount after tax is $" + String.format("%.2f", total));
        scnr.close();
    }
}
