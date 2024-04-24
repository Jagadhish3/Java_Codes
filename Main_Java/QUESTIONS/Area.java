import java.util.Scanner;
class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calArea(double radius){
        return (3.14)*radius*radius;
    }

    public double calPerimeter(double radius){
        return 2*(3.14)*radius;
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r=sc.nextDouble();
        Circle c1=new Circle();
        c1.setRadius(r);
        c1.getRadius();
        double area=c1.calArea(r);
        double perimeter=c1.calPerimeter(r);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);

    }
}
