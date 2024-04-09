import java.util.TreeSet;
public class A8_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set1=new TreeSet();
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(9);
        set1.add(12);


        TreeSet<Integer> set2 = new TreeSet();

        set1.add(9);
        set1.add(12);
        set1.add(14);
        // System.out.println("Before : "+set1);
        // System.out.println(set1.first());
        // System.out.println(set1.last());

        // System.out.println(set1.higher(5)); // ->  greater than
        // System.out.println(set1.ceiling(5));// -> greater than or equal

        // System.out.println(set1.lower(5));// -> lesser than
        // System.out.println(set1.floor(5));// -> lesser than or equal

        // System.out.println(set1.pollFirst());
        // System.out.println(set1.headSet(5));
        // System.out.println(set1.headSet(5,true));

        System.out.println(set1.tailSet(5));
        // System.out.println(set1.tailSet(5,true));
        
        // System.out.println(set1.subSet(3,12));
        // System.out.println(set1.subSet(3,false,12,false));
        // System.out.println(set1.subSet(3,true,12,true));
        
        System.out.println("After : "+set1);
    }
}
