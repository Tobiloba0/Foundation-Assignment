import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    double x1, y1, x2, y2, x3, y3;
    
    System.out.println("Enter the sides of the triangle: x1, y1, x2, y2, x3, y3 ");
    
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    x3 = input.nextDouble();
    y3 = input.nextDouble();

    double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

    double s = (side1 + side2 + side3) / 2;
    
    double sides = s * ((s - side1) * (s - side2) * (s - side3));
    
    double area = Math.sqrt(sides);
    
    System.out.printf("The area of the triangle is %.1f%n", area);

    


    }

}
