public class A2_Exception {
    public static void main(String[] args) {
        
        try{
            int arr[] = new int[5];
            arr[6]=100;
        }
        catch(ArithmeticException e){
            System.out.println("In Arithmetic block");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("In ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("In exception block");
        }

    }
}
// if you encounter exception in try block then the 
// code in try after exception will not be excecuted