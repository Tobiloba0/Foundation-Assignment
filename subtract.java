import java.util.Scanner;
public class subtract{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter the first number: ");
    int number1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = input.nextInt();

    System.out.println(subtraction(number1, number2));

}
    
    static int subtraction(int number1, int number2){
    int subtract;

    if (number1 > number2){
        subtract = number1 - number2;
    }else{
        subtract = number2 - number1;        
        }
        return subtract;
    }



     

}
