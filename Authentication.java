import java.util.Scanner;
public class Authentication{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    String username = "Tobiloba";
    int pinCode = 12345;
    
    System.out.println("Welcome to Dashboard");

    System.out.println("Login to your account");

    
    System.out.print("Enter your Username: ");
    String confirmUsername = input.nextLine();

    System.out.print("Enter your Pincode: ");
    int confirmPincode = input.nextInt();
    

    if(confirmUsername.equals(username) && confirmPincode == pinCode){
    System.out.println("Login successful");
    }else
    System.out.println("Login failed");
    

    }
}
