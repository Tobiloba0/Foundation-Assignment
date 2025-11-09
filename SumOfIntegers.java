import java.util.Scanner;

public class SumOfIntegers{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer number between 0 and 1000: ");
    int number = input.nextInt();
    
    int firstDigit = number / 100;
    int secondDigit = (number % 100) / 10;
    double thirdDigit = (number % 10);

    double sumOfDigits = firstDigit + secondDigit + thirdDigit;

    System.out.printf("The sum of the digits in %d is %.0f %n", number, sumOfDigits);

    

    

    

    }



}
