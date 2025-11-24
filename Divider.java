import java.util.Scanner;
public class Divider{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int quotient;
    
    System.out.print("Enter the first number: ");
    int number1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = input.nextInt();

    System.out.println(divide(number1, number2));
    

    }
    static int divide(int number1, int number2){
       int quotient;
       if (number2 == 0){
        quotient = 0;      
        }else{
        quotient = number1 / number2;
        }
        return quotient;
    
    }

}
