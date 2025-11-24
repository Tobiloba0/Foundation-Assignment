import java.util.Scanner;
public class palindrome{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integer numbers: ");
    int userInput = input.nextInt();   
    System.out.println(pallindrome(userInput));
 
  }
    static boolean pallindrome(int userInput){
    int digit1 = userInput / 10000;
    int digit2 = (userInput / 1000) % 10;
    int digit3 = (userInput / 100) % 10;
    int digit4 = (userInput / 10) % 10;
    int digit5 = userInput % 10;

    if (digit1 == digit5 && digit2 == digit4){
    return true;
    }else{
    return false;
    }

    }

}
