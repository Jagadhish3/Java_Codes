//Also called Single Abstract Method(SAM)
@FunctionalInterface
interface A{
    void display();
    //only one method -> functional interface
}
// class B implements A{
//     public void display(){
//         System.out.println("From B");
//     }
// }

class A17_FunctionalInterface {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void display(){
        //         System.out.println("From main");
        //     }
        // };
        // A obj = 
        // () -> {
        //     System.out.println("From main");
        // };
        A obj = () -> System.out.println("From main");

        obj.display();
    }
}
// Lambda expressions works on functional interfaces only