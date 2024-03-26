public class Intro {
    public static void main(String[] args) {
        System.out.println("Start Hello");

        try{
            //int a=2/0;
            // String str =null;
            // System.out.println(str.length());

            int arr[] = new int[5];
            arr[10] = 100;
        }catch(ArithmeticException e){
            System.out.println("In catch block" + e);
        }

        System.out.println("After Exception Encountered");

    }
}
//Exception Handling - In this we handle runtime errors and to maintain the normal
//flow of the exception

/*
   try{

   }
   catch(Exception e){

   }
 */
//All the exceptions comes from parent class -Throwable

/*  
  try -> it is used to specify blockwhere we should place an exception code.
  It should be followed by a catch block

  catch -> used to handle the exception
 */