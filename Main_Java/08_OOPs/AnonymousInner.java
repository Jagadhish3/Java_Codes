class A{
    void print(){
        System.out.println("Hello");
    }
}

class B extends A{
    void print(){
        System.out.println("Hey");
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        A obj = new A(){
            void print(){
                System.out.println("Hey");
            }
        };
        obj.print();
        
    }
}
