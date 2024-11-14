public class try3 {
    public static void main(String[] args) {
        int[] marks=new int[3];

        marks[0]=7;
        marks[1]=8;
        marks[2]=90;
        int index=2;
        int n=0;
        try{
            System.out.println("Value at 4 "+marks[index]);
            System.out.println("marks/n = "+marks[index]/n);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
