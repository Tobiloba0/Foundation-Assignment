import java.util.Scanner;
public class RangeChecker{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    int number;

    System.out.print("Enter a number: ");
    number = input.nextInt();

    if(number < 100){
    System.out.println("In range");
    }else
    System.out.println("Out of range");

    }



}
