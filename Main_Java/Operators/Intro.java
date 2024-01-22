class Intro{
    public static void main(String args[]){
        int a=2;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a+1);
        
        int output=b++;
        System.out.println(output);
        System.out.println(b); //post increment ++

        int output1=++a;
        System.out.println(output1);//pre increment ++
        
    }
}