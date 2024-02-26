class Student{
    void study(){
        System.out.println("Studying");
    }
}
class Student1 extends Student{
    void study(){

    }
}
public class Poly {
    public static void main(String[] args) {
        Student s1 = new Student1();
        s1.study();
    }
}
//1.Static polymorphism (Early Binding ) -> is a type of polymorphism that resolvs at compile time
// -> Method overloading is an example
//2.Dynamic (Late Binding) -> at runtime
// -> Method Overriding is an example
