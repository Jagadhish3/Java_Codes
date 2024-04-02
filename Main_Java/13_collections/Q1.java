import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<5;i++){
            int ele=sc.nextInt();
            l1.add(ele);
        }
        System.out.println("Original "+l1);
        Collections.swap(l1,1,2);
        System.out.println("After swapping "+l1);
    }

}
