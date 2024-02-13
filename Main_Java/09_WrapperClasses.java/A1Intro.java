class A1Intro {
    public static void main(String[] args) {
        // Integer i=5; // i is an object
        // int a=8;
        // Integer myInt = Integer.valueOf(a); //boxing (Primitive->Object explicitly)
        // Integer myInt1 = a;//auto-boxing -> automatic conversion of primitive data type to corresponding wrapper class
        // System.out.println(myInt);

        Integer a1 = 5;
        int y=a1.intValue();//unboxing
        int x=a1;// auto - unboxing-> automatic conv of wrapper type to its corresponding primitive type
        System.out.println(x);
        System.out.println(y);
    }   
}
// Wrapper classes provides the mechanism to convert primitive into objects
//    and object into primitive