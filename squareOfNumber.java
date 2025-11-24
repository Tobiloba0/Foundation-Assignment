import java.util.Scanner;
public class squareOfNumber{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int userInput = input.nextInt();

    System.out.print(square(userInput));
    
    
   }
    static int square(int userInput){
    int squareOfNumber = userInput * userInput;
    return squareOfNumber;

    }

}
