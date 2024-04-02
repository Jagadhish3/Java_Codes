import java.util.ArrayList;
import java.util.Arrays;
public class A2 {
    public static void main(String[] args) {
        //Convert arraylist to array
        ArrayList<String> l1=new ArrayList<>();
        l1.add("Mercury");
        l1.add("Venus");
        l1.add("Earth");
        l1.add("Mars");

        // String arr[] = new String[l1.size()];
        // l1.toArray(arr);

        // for(String s:arr){
        //     System.out.print(s+" ");
        // }

        //Convert array to arraylist
        // String arr[]={"Mercury","Venus","Earth"};

        // ArrayList<String> l1=new ArrayList<>(Arrays.asList(arr));
        // System.out.println(l1);

        //Convert to string
        System.out.println(l1.toString());
    }
}
