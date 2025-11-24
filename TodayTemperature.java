import java.util.Scanner;
public class TodayTemperature{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    int temperature;
    
    System.out.print("Enter today's temperature in degree celsius?");
    temperature = input.nextInt();
    
    if(temperature < 15){
    System.out.println("Cold");
    }else if(temperature  <= 30){
    System.out.println("Warm");
    }else
    System.out.println("Hot");

    }



}
