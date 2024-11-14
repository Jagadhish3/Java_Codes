public class trycatch {
    public static void main(String[] args) {
        int a=90;
        int b=0;
        try{
            int c=a/b;
            System.out.println("Result: "+c);
        }catch(Exception e){
            System.out.println("Failed. Reason: "+e);
        }
    }
}
