import java.util.Scanner;
public class factorInteger{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int userInput = input.nextInt();
    
    System.out.println(numberOfFactors(userInput));

    }

    static int numberOfFactors(int userInput){

    int factors = 0;
    for(int count = userInput; count > 0; count--){
    if(userInput % count == 0){
    factors++;
      }   
    }
    return factors;

    }

}
