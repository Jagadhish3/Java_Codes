class Car{
    private String color;
    private String model;
    private int year;
    private boolean rentalStatus;

    public Car(){
        color=null;
        model=null;
        year=0000;
        rentalStatus=false;
    }

    public Car(String color, String model, int year,boolean rentalStatus){
        this.color=color;
        this.model=model;
        this.year=year;
        this.rentalStatus=rentalStatus;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    
}

public class Q1 {
    public static void main(String args[]){
        Car obj=new Car("Red","XUV",2001,false);
        System.out.println(obj.getColor());
        System.out.println(obj.getModel());
        System.out.println(obj.getYear());
        
        
    }
}
