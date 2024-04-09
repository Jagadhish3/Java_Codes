import java.util.TreeSet;

public class TreeSetQ3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        
        TreeSetQ3 q3 = new TreeSetQ3();
        System.out.println( q3.greaterThanOrEqual(set, 20));
    }
    
    TreeSet<Integer> greaterThanOrEqual(TreeSet<Integer> set, int n) {
        return (TreeSet<Integer>) set.tailSet(n);
    }
}
