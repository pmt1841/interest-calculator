import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        double totalInterest = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");

        money = input.nextDouble();
        System.out.print("Enter number of months: ");

        month = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }

        System.out.printf("Total of interest: %.1f%n", totalInterest);
    }
}
