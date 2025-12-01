public class LowestCommonMultiple{
    public static void main(String[]args){
    
    int number1 = 5;
    int number2 = 10;

    System.out.println(LowestMultiple(number1, number2));

    }
        public static int LowestMultiple(int number1, int number2){
            
            int gcd = GCD.greatestDivisor(number1, number2);
            int LCM = (number1 * number2) / gcd;
            return LCM;
            
        }

    


}
