import java.util.Scanner;
public class primeNumber{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to check if it's a prime number: ");
    int userInput = input.nextInt();

    System.out.println(primeNumber(userInput));
}
     static String primeNumber(int userInput){

     for(int count = 2; userInput > count; userInput--){

     if (userInput % 2 != 0){
     return "true";
     }else{
     return "false";
     
    }    
 }
    
}




