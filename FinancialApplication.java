import java.util.Scanner;

public class InvestmentAmount{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter balance and interest rate: ");
    double balance = input.nextInt();
    double annualInterestRate = input.nextInt();
    double monthlyInterest = balance * (annualInterestRate / 1200);

    System.out.printf("The interest rate is :%.4f%n ", monthlyInterest);



    }

}
