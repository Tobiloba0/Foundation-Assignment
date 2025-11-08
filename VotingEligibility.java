import java.util.Scanner;
public class VotingEligibility{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    int age;

    System.out.print("Enter your age: ");
    age = input.nextInt();

    if(age < 18){
    System.out.println("You are not eligible for the voting process");
    }else
    System.out.println("Congratulations, you are eligible to vote.");
    }




}
