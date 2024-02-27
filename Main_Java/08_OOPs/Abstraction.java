abstract class Car{
    void drive(){
        System.out.println("Drive");
    }
    void brake(){//Concrete methods

    }

    abstract void speed();
}

class Ford extends Car{
    void speed(){
        System.out.println("Speed");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car c1=new Ford();
        // Car c1=new Car()
        c1.drive();
        c1.speed();
    }
}
// We cant create obj of abstract class
// Abstract class -> must be declared with abstract keyword
// It can have abstract and non abstract methods
//It can not be Instantiated
//It can have constructors and static methods
