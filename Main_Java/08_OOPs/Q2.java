class Shape{
    double radius;
    double base;
    double height;
    public void draw(){
        System.out.println("Drawing shape");
    }
    public double calArea(){
        return 0;
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
    double calArea(double r){
        this.radius=r;
        double area=4*3.14*r;
        return area;
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Square");
    }
    double calArea(double r){
        this.radius=r;
        double area=r*r;
        return area;
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle");
    }
    double calArea(double b,double h){
        this.base=b;
        this.height=h;
        double area=0.5*b*h;
        return area;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        Square s1= new Square();
        System.out.println(s1.calArea(7));
    }
}
