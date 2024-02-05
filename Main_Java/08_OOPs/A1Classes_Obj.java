class Calculate{

    public int Add(int x,int y){
        int result = x+y;
        return result;
    }

    public double Add(double x,double y){
        
        return 0;
    }
}



class A1Classes_Obj {
    public static void main(String args[]){
        // int num1 = 5;
        // int num2 = 10;
        // //System.out.println(num1 + num2);
        Calculate Ref = new Calculate();

        int Res=Ref.Add(1,5);
        System.out.println(Res);
    }
}

/* Method Overloading
 *   When class has multiple methods with same name but different parameters
 * Overloading can be done -
 *    --by changing no of arguments
 *    --by changing data type
 */