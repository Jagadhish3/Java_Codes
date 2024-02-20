// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.
class Vehicle{
    String id;
    double maxSpeed;

    public Vehicle() {
        this.maxSpeed = 0; 
        this.id = null; 
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSpeed() {
        return maxSpeed;
    }
    public void setSpeed(double speed) {
        this.maxSpeed = speed;
    }
    public void display(){
        System.out.println(" ID: "+id+" Speed: "+maxSpeed);
    }
    
}
class Car extends Vehicle{
    int passengers;

    public Car(int passengers){
        this.passengers=passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void display(){
        System.out.println("Capacity: "+passengers+" ID: "+id+" Speed: "+maxSpeed);
    }

}

class Trucks extends Vehicle{
    int maxWeight;
    public Trucks(int maxWeight){
        this.maxWeight=maxWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void display(){
        System.out.println("MaxWeight: "+maxWeight+" ID: "+id+" Speed: "+maxSpeed);
    }
    
}

class Bicycles extends Vehicle{
    public void display(){
        System.out.println("ID: "+id+" Speed: "+maxSpeed);
    }
}
public class Q1Inherit {
    public static void main(String[] args) {
        
        Car c1=new Car(25);
        c1.setId("C123");
        c1.setSpeed(100);
        Trucks t1=new Trucks(200);
        Bicycles b1=new Bicycles();

        c1.display();
        t1.display();
        b1.display();
    }
}
