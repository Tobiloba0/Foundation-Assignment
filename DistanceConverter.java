import java.util.Scanner;

public class DistanceConverter{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    double mile;
    
    System.out.print("Enter distance in miles: ");
    mile = input.nextDouble();
    
    double milesToKilometers = mile * 1.6;

    System.out.printf("%.0f miles is %.1f kilometers ", mile, milesToKilometers);

    


    }

}
