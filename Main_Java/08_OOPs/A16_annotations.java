class A{
    void theNameOfTheMethodIsVeryVeryLong(){
        System.out.println("From A");
    }
}

class B extends A{
    @Override
    void theNameOfTheMethodIsVeryVeryLong(){
        System.out.println("From B");
    }
}

class A16_annotations {
    public static void main(String[] args) {
        B obj = new B();

        obj.theNameOfTheMethodIsVeryVeryLong();
    }
}
/*  Annotations:-
- Helping hand to the compiler
- HardCoded and need to be followed
*/