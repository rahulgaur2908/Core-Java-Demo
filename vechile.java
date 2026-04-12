abstract class vehicle{
    abstract void start();  // Must override
   

    void fuelType(){

        System.out.println("Fuel Type: Petrol/Diesel");

    }

}


class Car extends vehicle{
    void start (){

        System.out.println("Car is starting with key: ");
    }
}

public class vechile{
    public static void main(String[] args) {
        //Object Create
        Car c = new Car();

        // Methods Call
        c.start();
        c.fuelType();
    }
}