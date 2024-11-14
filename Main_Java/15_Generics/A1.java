class MyGeneric <T>{
    T a;
    public T getVal(){
        return a;
    }
    public void setVal(T a){
        this.a=a;
    }
}

public class A1 {
    public static void main(String[] args) {
        MyGeneric<Integer> i1= new MyGeneric<>();

        i1.setVal(5);
        System.out.println(i1.getVal());

        MyGeneric<String> s1=new MyGeneric<>();
        s1.setVal("siii");
        System.out.println(s1.getVal());
    }
}
