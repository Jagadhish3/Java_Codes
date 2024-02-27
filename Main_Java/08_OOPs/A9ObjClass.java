class Phone{
    String model;
    int price;
    
    public String toString() {
        return "Phone [model=" + model + ", price=" + price + "]";
    }
    public boolean equals(Object other){
        if(this.model.equals(other.model)&& this.price == other.price){
            return true;
        }
        return false;
    }
}
class A9ObjClass{
    public static void main(String[] args) {
        Phone obj = new Phone();
        Phone obj1 = new Phone();
        obj.price=100;
        obj1.price=100;
        // System.out.println(obj);
        // System.out.println(obj1);
        // System.out.println(obj1.toString());
        // boolean b1=obj.equals(obj1);
        // System.out.println(b1);
        System.out.println(obj.equals(obj1));
        
    }
}
