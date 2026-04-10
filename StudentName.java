// Create a program to accpet the student name, Charactor length, upper case and lower case.

import java.util.Scanner;

public class StudentName {
    public static void main(String[] args){

        // Step 1: Create a Scanner object to take input from user.
        
        Scanner sc = new Scanner(System.in);

        // Step 2: Ask user to enter Student name.

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Step 3: Print orignal name.

        System.out.println("Orignal Name: " + name);

        // Step 4: Find and print length of the name.

        System.out.println("Length of Name: " + name.length());

        // Step 5: convert name to uppercase.

        System.out.println("Uppercase: " + name.toUpperCase());

        // Step 6: Convert name to lowercase.

        System.out.println("Lowercase: " + name.toLowerCase());

        // Step 7: Close Scanner

        sc.close();

    }
}










