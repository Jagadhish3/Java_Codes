class Car{
    int price = 100;
    final void drive(){
        System.out.println("Car is Driving");
    }
}
class Ford extends Car{
    // void drive(){
    //     //Cant ovverride final methods
    //     System.out.println("Ford is driving");
    // }
}
class Intro {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.price=200;
        System.out.println(c1.price);
        c1.drive();
        // Ford f1=new Ford();
        // f1.drive();
    }
}
//If class is made final then it cant be extended
// If we make variable as final we cant change value of it.
// If we make method as final we cant override it

//Can we inherit final method -> YES
//Can we make constructor final -> NO
