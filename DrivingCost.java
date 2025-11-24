import java.util.Scanner;

public class DrivingCost{
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.println("Enter the driving distance: ");
    double drivingDistance = input.nextDouble();

    System.out.println("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();

    System.out.println("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();

    double costOfDriving = ((drivingDistance / milesPerGallon) * pricePerGallon);

    System.out.printf("The cost of driving is $ %.2f%n", costOfDriving);

    


    }




}
