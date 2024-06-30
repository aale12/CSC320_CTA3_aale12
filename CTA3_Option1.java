import java.util.Scanner; //Import the Scanner class

public class CTA3_Option1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your weekly income");

        double userIncome = scnr.nextDouble();
        double tax = 0;
        double total = userIncome + tax;
        System.out.println("Inputted weekly income is:" + userIncome);

        if (userIncome < 500) {
            tax = userIncome * 0.10;
        } else if (userIncome >= 500 && userIncome < 1500) {
            tax = userIncome * 0.15;
        }
    }
}
