import java.util.Scanner;
public class EvenInteger{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a num:");
    int userInput = input.nextInt();

    System.out.println(evenOdd(userInput));
}
        static String evenOdd(int userInput){

        if (userInput % 2 == 0){
        return "true";
        }else{
        return "false";
        }

    }
}

