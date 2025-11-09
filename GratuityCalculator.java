import java.util.Scanner;

public class GratuityCalculator{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    double subtotal;
    double gratuity;

    System.out.print("Enter the subtotal: ");
    subtotal = input.nextDouble();
    
    System.out.print("Enter the gratuity: ");
    gratuity = input.nextDouble();

    gratuity = (gratuity / 100) * subtotal;

    subtotal = gratuity + subtotal;

    System.out.println("The gratuity is $" + gratuity + " and total is $" + subtotal );

    
    
    }



}
