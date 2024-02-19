class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}


class Dog extends Animal{
    public void bark(){
        System.out.println("I can bark");
    }
}
public class Intro {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
