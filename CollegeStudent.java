// Write a program to create parent child class realationship and inherit property\objects.

class StudentParent{

    // Parent class property.
    int rollNo = 101;
    String name = "Rahul";

    // Parent class method.

    void StudentDetails(){
        System.out.println("Roll No. " + rollNo);
        System.out.println("Name: " + name);

    }
    
}

  // child class inherits parent class

  public class CollegeStudent extends StudentParent{
    // Child class property.
     String collegeName = "ABC College";

     // child class method.
     void showCollegeDetails(){
        System.out.println("College Name: " + collegeName);
     }

     public static void main(String[] args) {
        
        // create of child class.
        CollegeStudent cs = new CollegeStudent();

        // Access parent class method.
        cs.showCollegeDetails();

        // Access child class method.

        cs.showCollegeDetails();
     }

  }

 