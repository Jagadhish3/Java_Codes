// package Java_Codes.Main_Java.QUESTIONS;
import java.util.List;
import java.util.ArrayList;
interface A{
    public void findMaxMin(List<Integer> l);
}
public class Lambda {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(7);
        l1.add(18);
        l1.add(2);
        l1.add(9);
        l1.add(61);

        
        A obj = (l)->{
            int max=l1.get(0);
            int min=l1.get(0);
            for(int i:l){
                if(i>max){
                    max=i;
                }
                if(i<min){
                    min=i;
                }
            }
            System.out.println("Max= "+max+" \nMin: "+min);
        };

        obj.findMaxMin(l1);
    }
}
