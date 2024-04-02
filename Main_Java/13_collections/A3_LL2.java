import java.util.LinkedList;
import java.util.Deque;
import java.util.Queue;
public class A3_LL2 {
    public static void main(String[] args) {
        // Queue<String> ll1 = new LinkedList<>();

        // ll1.add("Mercury");
        // ll1.add("Venus");
        // ll1.add("Earth");
        // ll1.add("Mars");

        // // System.out.println(ll1.peek());
        
        // //remove head from element
        // // System.out.println(ll1.poll());
        // // System.out.println(ll1);

        // // ll1.offer("Jupiter");
        // System.out.println(ll1);

        Deque<String> ll1 = new LinkedList<>();

        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");

        ll1.addFirst("Jupiter");
        ll1.addLast("Saturn");

        System.out.println(ll1);
    }
}
