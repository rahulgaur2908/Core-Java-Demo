import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Create a variable to enter two value
      //Perform oprerations
      //Display results
      
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter two numbers:");
           double a = sc.nextDouble();
           double b = sc.nextDouble();
      System.out.println("Sum is "+(a+b));
      sc.close();
    }
}