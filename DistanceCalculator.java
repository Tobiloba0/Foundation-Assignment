import java.util.Scanner;

public class DistanceCalculator{
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter initial velocity in meters/seconds: ");
    double velocity = input.nextDouble();

    System.out.print("Enter time spans in seconds: ");
    double time = input.nextDouble();

    System.out.print("Enter acceleration in meters/seconds^2);
    double acceleration = input.nextDouble();
    
    double distanceCovered = ((velocity * time) + 0.5 * (acceleration * (time * time)));
    
    System.out.println("The distance covered is " + distanceCovered + "kms");


    }



}
