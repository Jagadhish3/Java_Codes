public class A5Strings {
    public static void main(String[] args) {
        // String name ="Hello";

        String s1=new String("Hello");
        System.out.println(s1+" World");
        StringBuilder sb=new StringBuilder(s1);
        s1.charAt(0);
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());
        s1.replace('o','w');
        System.out.println(s1.replace('o','w'));
        System.out.println(s1.replace('l','o'));
        System.out.println(sb.reverse());
    }
}


// In Java, Strings are immutable
//Strings are an object that represents sequence of char values
//whenever we create a string, the jvm checks the "String constant pool " first.
//If the string exists in the pool, a reference to pooled instance is returned.
//If doesnt exists in pool a new string instance is created and placed in pool.
//This makes java memory efficient because no new objects are created if it already 
// exists in the scp.