class Test{
    public int add(int ... num1){
        int sum=0;
        for(int i : num1){
            sum=sum+=i;
        }
        return sum;
    }
}

public class A1 {
    public static void main(String[] args) {
        Test obj = new Test();
        int a=obj.add(2,3,4);
        System.out.println(a);
    }
}
