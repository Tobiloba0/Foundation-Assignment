public class NumberAmstrong{
    public static void main(String[]args){

      System.out.print(isAmstrong(153));
        
        
    }

        public static int numberOfDigits(int number){
        
        String numberConvert = Integer.toString(number);
        return numberConvert.length();

        }
        //method to find if number is Amstrong
        public static boolean isAmstrong(int userInput){

           int sum = 0;
           int digits = numberOfDigits(userInput);
           int value = userInput;
            
           while(value > 0){
            int lastDigit = value % 10;
            double raised = Math.pow(lastDigit, digits);
            sum += raised;
            value = value/10;
            
           } 
            return sum == userInput;        
   
        }      
}

