
import java.util.PriorityQueue;
public class APriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();

        pq1.add(8);
        pq1.add(14);
        pq1.add(2);

        System.out.println("Before : "+pq1);
        System.out.println("Peek : "+pq1.peek());
    }
}
