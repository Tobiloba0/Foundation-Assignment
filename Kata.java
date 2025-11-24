public class Kata{

    static int factorial(int userInput){
    int factorialValue = 1;
    for(int count = userInput; count > 0; count--){
         factorialValue *= count;
    }
        return factorialValue;


    static int divide(int number1, int number2){
       int quotient;
       if (number2 == 0){
        quotient = 0;      
        }else{
        quotient = number1 / number2;
        }
        return quotient;
    

    static boolean squareRooter(int userInput){

    double square = Math.pow(userInput, 0.5);
    int squareRoot = (int) square;
    
    if (squareRoot * squareRoot == userInput){
    return true;
    }else
    return false;


     static int subtraction(int number1, int number2){
    int subtract;

    if (number1 > number2){
        subtract = number1 - number2;
    }else{
        subtract = number2 - number1;        
        }
        return subtract;

    static String primeNumber(int userInput){

     for(int count = 2; userInput > count; userInput--){

     if (userInput % 2 != 0){
     return "true";
     }else{
     return "false";

     
    static int square(int userInput){
    int squareOfNumber = userInput * userInput;
    return squareOfNumber;

    static int numberOfFactors(int userInput){

    int factors = 0;
    for(int count = userInput; count > 0; count--){
    if(userInput % count == 0){
    factors++;
      }   
    }
    return factors;
    
    static String evenOdd(int userInput){

        if (userInput % 2 == 0){
        return "true";
        }else{
        return "false";
        }

    }
}
    
    
    

    









    

}
