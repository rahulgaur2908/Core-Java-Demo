// Write a program to create a constructor of employee class to intialize employee data.

import java.util.Scanner;
public class DataInitilization {
    
    // Step 1: Declare employee attributes.

    int empID;
    String empName;
    double salary;

    // Step 2: Create constructor to initialize object values.

    DataInitilization(int id, String name, double sal){
        empID = id;
        empName = name;
        salary = sal;

    }

    // Step 3: Methods to display employee details.
    
    void displayEmployee(){

    
    System.out.println("Employee ID: " + empID);
    System.out.println("Employee Name: " + empName);
    System.out.println("Salary: " + salary);
    
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        //Initialize object using constructor.

       DataInitilization e1 = new   DataInitilization(id, name, salary);

        //Display.

        e1.displayEmployee();
        sc.close();
       
    }
}

        
       


        



         
 