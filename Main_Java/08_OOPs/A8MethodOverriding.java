class Bank{
    public int getLoanInterest(){
        return 0;
    }
}

class ICICI extends Bank{
    public int getLoanInterest(){
        return 10;
    }
}
class SBI extends Bank{

}

public class A8MethodOverriding {
    public static void main(String[] args) {
        ICICI bank1=new ICICI();
        System.out.println(bank1.getLoanInterest());
    }
}
//Method Overriding is used to provide specific implementation at the method that is already
//provided by its parent class.

//If method is static then we cant override
//Should have same name as the parent class
// The method must have same parameters as the parent class