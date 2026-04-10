// Create an array to store Marks of 5 student and print them using loop.

public class Array {
    public static void main(String[] args){
        // Step 1: Create an array to store marks of 5 students.
        int[] marks = {78, 85, 92, 67, 88,};

        /*  To store marks of 10 student.
        int[] marks = {78, 85, 92, 67, 88, 50, 74, 48, 87, 69};*/

       // Step 2: Print heading.

        

        System.out.println("Student Marks: ");

        // Step 3: Use for loop to access each element of the array.

        for (int i = 0; i < marks.length; i++){

        // Step 4: Print student number and corresponding marks.

        System.out.println("Student " + (i + 1) + " Marks = " + marks[i]);
        }

    }

}