import java.util.Scanner;

public class TimeConverter{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of minutes: ");
    double minutes = input.nextDouble();

    double minutesInYear= 60 * 24 * 365;

    int years = (int)(minutes / minutesInYear);

    int days = (int)((minutes % minutesInYear) / (60 * 24));

    System.out.print((int)minutes + " minutes is approximately " + years + " and " + days + "days");



    }

}
