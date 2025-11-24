import java.util.Scanner;
public class squareRoot{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int userInput = input.nextInt();
    System.out.println(squareRooter(userInput));
 
   }

    static boolean squareRooter(int userInput){

    double square = Math.pow(userInput, 0.5);
    int squareRoot = (int) square;
    
    if (squareRoot * squareRoot == userInput){
    return true;
    }else
    return false;

    }

}
