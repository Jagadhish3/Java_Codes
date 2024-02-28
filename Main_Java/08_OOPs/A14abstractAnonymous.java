abstract class A{
    abstract void print();
}
class B extends A{
    void print(){
        System.out.println("Hello");
    }
}
public class A14abstractAnonymous {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.print();
        A obj = new A(){
            void print(){
                System.out.println("Hello again");
            }
        };
        obj.print();
    }
}
