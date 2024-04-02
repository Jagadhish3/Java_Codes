import java.util.LinkedList;

public class A3_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");

        //ll1.get(1);

        //ll1.set(1,"test");

        // ll1.remove(1);
        
        System.out.println("Original: "+ll1);
    }
}

// Elements in LL are not stored in a sequence, they are
// scattered and connected through "prev" and "next" links