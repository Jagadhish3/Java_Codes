import java.util.ArrayList;
public class Intro {
    public static void main(String[] args) {
        
        ArrayList<String> list1=new ArrayList<>();

       // ArrayList<int> list2=new ArrayList<>();
        //ArrayList<Integer> list2=new ArrayList<>();

        list1.add("Mercury");
        list1.add("Earth");
        list1.add("Venus");
        list1.add("Mars");
        System.out.println("Orginal : "+list1);
        
        for(String st : list1){
            System.out.println(st);
        }
        //access
        // System.out.println(list1.get(3));
        //size
        //System.out.println(list1.size());

        //change
        // list1.set(0,null);
        // list1.set(2,"Jupiter");

        // remove
        // list1.remove(1);

        //Clone
        // ArrayList<String> list2=(ArrayList<String>)list1.clone();
        // System.out.println("New List "+list2);

        //contains
        // System.out.println(list1.contains("Mars"));


        // System.out.println("Modified : "+list1);
    }
}
//ArrayList allows us to create resizable/dynamic arrays