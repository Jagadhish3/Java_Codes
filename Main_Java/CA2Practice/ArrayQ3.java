import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n=0;
        int[] arr1=new int[n];
        for(int i=0;i<size-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }else{
                    arr1[n++]=arr[i];
                }
            }
        }
        System.out.println(n);
    }
}