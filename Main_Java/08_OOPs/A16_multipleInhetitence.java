interface A{
    void display();
}
interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("show from c");
    }
    public void display(){
        System.out.println("display from c");
    }
}
public class A16_multipleInhetitence {
    public static void main(String[] args) {
        C c1 = new C();

        c1.show();
        c1.display();
    }
}
