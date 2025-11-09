import java.util.Scanner;

public class ReverseOrder{    
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number to be reversed: ");
    int number = input.nextInt();
    
    int digit1 = number % 10;

    int digit2 = (number % 100) / 10;

    int digit3 = (number % 1000) / 100 ;
    
    int digit4 = number / 1000;
    
    System.out.println("Reversed number is: "+ digit1 + digit2 + digit3 + digit4);





    }
}
