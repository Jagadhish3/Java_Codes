public class A5_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb);
        sb.insert(0,'j');
        System.out.println(sb);
    }   
}


//String buffer used to create mutable string objects