import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        long Factorial = 1;

        for (int i = 1; i <= num; i++){
            Factorial *= i;
        }
        System.out.println(" Factorial of " + num + " is: " + Factorial);
        sc.close();
    }
}
    

