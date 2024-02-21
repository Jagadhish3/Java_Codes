class Calculation{
    int a;
    public Calculation(int a){
        this.a=a;
    }

    public void area(){
        int area= a*a;
        System.out.println("Area : " + area);
    }

    public void perimeter(int b){
        int perimeter = 4 * b;
        System.out.println("Permiter : " + perimeter);
    }
}

public class AnonymousObj {
    public static void main(String[] args) {
        new Calculation(10).area();
        //If u want to use the class one time you can use above method
        //  we dont have reference
        //  it takes heap mmory and deleted after execution
    }
}
