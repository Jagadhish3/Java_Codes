interface Food{//abstract by default
    //abstract void eat();
    void eat();//public abstract by default
    //Pure Abstraction
    int x=5;//public static final by default
}

class NonVeg implements Food{
    public void eat(){
        System.out.println("Non-Veg Food");
    }
}
// class Veg{
//     void eat(){
//         System.out.println("Veg Food");
//     }
// }
class Veg implements Food{
    public void eat(){
        System.out.println("Veg Food");
    }
}
class Dog{
    // void eating(Veg item){//depending on class Veg
    //     item.eat();
    // }
    void eating(Food item){
        item.eat();
    }
}
public class A15_Interface {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        Veg v1= new Veg();

        NonVeg nv1=new NonVeg();
        
        d1.eating(v1);
        d1.eating(nv1); //Depending on class veg because argument is of type Veg in method
    }
}
//class -> extends class
//class -> implements interface
//interface extends interface