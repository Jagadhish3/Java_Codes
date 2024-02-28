class A{
    void hello(){
        System.out.println("Hello");
    }

    static class B{
        void print(){
            System.out.println("Print");
        }
    }
}
public class A13_Inner {
    public static void main(String[] args) {
       A obj = new A();
       obj.hello(); 
       //B obj1 = new B(); -> Not work
       //A.B obj1=obj.new B();// Non static
       A.B obj1=new A.B();
       obj1.print();

    }
}
