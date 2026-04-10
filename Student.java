public class Student{

    int rollNo;
    String name;

    // Constructor.

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] arge){

        Student s1 = new Student(1 , "Rahul");
        Student s2 = new Student(2 , "Nikhil");

        s1.display();
        s2.display();
    }


}