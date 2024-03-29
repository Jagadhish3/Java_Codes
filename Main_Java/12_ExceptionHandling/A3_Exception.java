public class A3_Exception {
    public static void main(String[] args) {
        try{
            int a=30/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("From finally block");
        }
        System.out.println("Last statement");
    }
    
}
//Finally block is always executed whether an exception is handled or not