@FunctionalInterface
interface A{
    void EvenOrOdd(int n);
}
public class A18_Q1 {
    public static void main(String[] args) {
        A obj = n -> {
            if(n%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        };

        obj.EvenOrOdd(100);
    }
}