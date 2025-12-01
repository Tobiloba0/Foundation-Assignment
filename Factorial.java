import java.util.Scanner;

public class Factorial{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    long factorial = 1;

    System.out.print("Enter a number: ");    
    int userInput = input.nextInt();

    for(int count = 1; count <= userInput; count++){
        factorial = factorial * count;
    }
    System.out.println("The factorial of " + userInput + " is:" + factorial);
    


    }


}
