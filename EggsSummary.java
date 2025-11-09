import java.util.Scanner;

public class EggsSummary{    
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Hello!, how many eggs do you have over there? ");
    int Eggs = input.nextInt();
    
    int gross = Eggs / 144;

    int grossRemainder = Eggs % 144;

    int dozen = grossRemainder / 12;
    
    int dozenRemainder = grossRemainder % 12;

    int leftover = dozenRemainder;
    
    System.out.print("Your number of eggs is " + gross + " gross, " + dozen + " dozen(s)" + " and " + leftover + " left over(s)");





    }
}
