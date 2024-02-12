class Person{
    public String name;
    public int No;
    public int age;

    public Person(){
        System.out.println("From Constructor");
        name="john";
        No=7;
        age=79;
    }

    public Person(String name,int No,int age){
        this.name=name;
        this.No=No;
        this.age=age;
    }

    public Person(Person obj){
        //Person o=new Person();
        name=obj.name;
    }
    
    public void output(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("No: "+No);
    }
}
public class A4Constructors {
    public static void main(String[] args) {
        //Constructors
        Person p1=new Person();
        Person p2=new Person(p1);
        p1.output();
        p2.output();
    }
}


/* 
    -A constructor is a block of code similar to a class
    -It is called when an instance of class is created
    -Every time an object is created using new keyword, at lease one
        constructor is called.
    -Java compiler provides default constructor by default,this constructor is 
    called if there is no constructor in class.

    Rules-
    -Constructor name must be same as its class name
    -Constructor should not have any return type
 */