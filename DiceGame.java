import java.util.Random;

public class DiceGame{
    public static void main(String [] args){
    Random face = new Random();

    int number1 = face.nextInt(6) + 1;

    int number2 = face.nextInt(6) + 1;

    int total = number1 + number2;

    System.out.println("Your first die shows " + number1);    
    
    System.out.println("Your second die shows " + number2);    

    System.out.println("Your total roll is " + total);    
    }



}
