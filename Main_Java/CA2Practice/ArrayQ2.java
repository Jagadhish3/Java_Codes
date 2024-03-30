import java.util.Scanner;
public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int e=0;
        int o=0;
        for(int i:arr){
            if(i%2==0){
                e++;
            }else{
                o++;
            }
        }
        System.out.println("Even: "+e+" Odd: "+o);
    }
}