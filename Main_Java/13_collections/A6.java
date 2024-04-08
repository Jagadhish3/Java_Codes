import java.util.HashSet;
import java.util.Iterator;
public class A6 {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet();

        set1.add(2);
        set1.add(4);
        set1.add(5);

        // Iterator<Integer> itr = set1.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        HashSet<Integer> set2=new HashSet();
        set2.add(5);
        set2.add(4);
        set2.add(7);

        // set1.retainAll(set2);
        // System.out.println(set1);
        
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
