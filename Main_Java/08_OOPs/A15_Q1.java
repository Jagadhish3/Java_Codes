// // Write a Java program to create an interface Flyable with a method called fly_obj().
//  Create three classes Spacecraft, Airplane, and Helicopter
//  that implement the Flyable interface. Implement the fly_obj() 
// method for each of the three classes.

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraft");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter");
    }
}
class A15_Q1{
    public static void main(String[] args) {
        Spacecraft s1=new Spacecraft();

        s1.fly_obj();

        Airplane a1 = new Airplane();

        a1.fly_obj();

        Helicopter h1 = new Helicopter();

        h1.fly_obj();
    }
}