import java.util.Scanner;

public class DrivingCost{
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.println("Enter investment amount: ");
    double investmentAmount = input.nextDouble();

    System.out.println("Enter annual interest rate in percentage: ");
    double annualInterest = input.nextDouble();

    System.out.println("Enter number of years ");
    double numberOfYears = input.nextDouble();

    double monthlyInterest = annualInterest / 12;

    double futureValue = (investmentAmount * Math.pow((1 + monthlyInterest), numberOfYears * 12));

    System.out.printf("Future value is $ %.2f%n", futureValue);

    


    }




}
