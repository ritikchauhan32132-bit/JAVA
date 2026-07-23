
import java.util.Scanner;

class first{
    public static void main(){
        
    int a, b;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 1 Number: ");
    a = input.nextInt();
    
    System.out.print("Enter 2 Number: ");
    b = input.nextInt();

    System.out.println("Bitwise Operator");
    
    System.out.println("Additive Assignment: " + (a & b));
    System.out.println("Subtractive Assignment: " + (a | b));

    }
}