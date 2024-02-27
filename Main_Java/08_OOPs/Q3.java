abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion- eat");
    }
    void sleep(){
        System.out.println("Lion - sleep");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger - eat");
    }
    void sleep(){
        System.out.println("Tiger - sleep");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer - eat");
    }
    void sleep(){
        System.out.println("Deer - sleep");
    }
}
public class Q3 {
    public static void main(String[] args) {
        
        Animal d1 = new Deer();
        Animal t1 = new Tiger();
        d1.eat();
        t1.sleep();
    }
}
