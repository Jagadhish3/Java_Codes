import java.util.Iterator;
import java.util.TreeSet;
public class A7_Set3 {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet();
        set1.add(3);
        set1.add(2);
        set1.add(7);

        // System.out.println(set1);

        // TreeSet<Integer> set2 = new TreeSet();
        // set2.add(5);
        
        // set1.addAll(set2);

        // System.out.println(set1);

        Iterator itr = set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
            
        }
    }
}

// HashSet implements set interface
// No order

//TreeSet implements Set interface and SortedSet interface
//Sorted order (ascending by default())