// find the greatest divisor of numbers

public class PerfectNumber{

    public static boolean isPerfect(int number){
    int perfectNumber = 0;
    
        //solving the factors - the  number
        for(int count = 1; count < number; count++){
            if(number % count == 0){
            perfectNumber += count;               
            }
         
       }
            if(perfectNumber == number){
                return true;            
            } 
       return false; 

    }
    public static void main(String[]args){
    
    int number = 28;

    System.out.println(isPerfect(number));    
    }


}
