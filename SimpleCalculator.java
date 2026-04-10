// Write a program to build methods for add, multiply, subtract, and divide.

import java.util.Scanner;

public class SimpleCalculator{

    // Method 1: Addition.

    public static int add(int a, int b){
        return a + b;
    }

    // Method 2: Substraction.

    public static int subtract(int a, int b){
        return a - b;
    }

    // Method 3: Multiplication.

    public static int multiply(int a, int b){
        return a * b;
    }
    
    //Method 4: Division.

    /*public static int divide(int a, int b){
        return a / b;
    }*/
     
        // If the input is 0 then this code is hellpful.
         public static String divide(int a, int b){
            if (b == 0){

            }
        return "Not Defined";
    }

    public static void main(String[] args) {
        
        // Step 1: declare two variables.
         /*int num1 = 0;
        int num2 = 60; */

        //Taking input from user.

        // Step 1: Create Scanner object.

        Scanner sc = new Scanner(System.in);

        //Take  input from user.

        System.out.println("Enter First Number: ");
         int num1 = sc.nextInt();

         System.out.println("Enter Second Number: ");
         int num2 = sc.nextInt();

         // Step 2: Call methods and print result.
       
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        sc.close();

    }
}        
   
       

       


    


  

 

      



