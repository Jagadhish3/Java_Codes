class Intro{
    public static void main(String args[]){

        // int num=5;
        // float a=5f;
        // System.out.println(num);
        // System.out.println(a);



        //Type Casting
        /*
         * Widening Casting(Automatically)
         *      byte->short->int->long
         * Narrow Casting(Manual)
         *      long->int->short->byte
         */

        int myInt =10;
        double myDouble=myInt; //Automatic casting
        
        double myDouble1=10.12345;
        int myInt1=(int) myDouble1; //Manual

        System.out.println(myDouble);
        System.out.println(myInt1);

    }
}