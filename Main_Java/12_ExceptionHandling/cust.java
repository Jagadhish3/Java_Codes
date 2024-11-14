class  MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
public class cust {
    public static void main(String[] args) {
        try{
            throw new MyException("GFG");
        }
        catch(MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
