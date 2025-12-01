// find the greatest divisor of numbers

public class GCD{

    public static int greatestDivisor(int number1, int number2){
    int GCD = 1;
    
        //solving the factors in number1 and number2
        for(int count = 1; count <= number1 && count <= number2; count++){
            if(number1 % count == 0 && number2 % count == 0){
            GCD = count;               
            }
         
       }
       return GCD; 

    }
    public static void main(String[]args){
    
    int number1 = 12;
    int number2 = 18;

    System.out.println(greatestDivisor(number1, number2));    
    }


}
