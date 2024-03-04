interface A{
    void print();
}
interface B extends A{
    void show();
}

class Myclass implements B{
    public void show(){
        System.out.println("show");
    }
    public void print(){
        System.out.println("print");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        
        Myclass obj=new Myclass();
        obj.print();
        obj.show();
    }
}
