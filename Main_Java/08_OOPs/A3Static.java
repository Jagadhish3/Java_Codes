class Student{
    public String stuName;
    public int Rno;
    public static String uniName;

    public void  output(){
        System.out.println(stuName + " " + Rno + " " + uniName);
    }

    // public static void myStaticMethod(){
    //     System.out.println("From static method " + uniName + Rno);
    // }  non static variable creates confusion
    public static void myStaticMethod(Student obj){
        System.out.println("From static method " + uniName + obj.Rno);
    }
}


class A3Static {
    public static void main(String args[]){
        Student s1 = new Student();
        
        s1.stuName="Sri";
        s1.Rno=1;
        Student.uniName="R";
        
        Student s2 = new Student();
        
        s2.stuName="Ram";
        s2.Rno=2898;
        

        s1.output();
        s2.output();

        // Student.myStaticMethod();
        Student.myStaticMethod(s2);
    }
}


// Static keyword for memory management
// A static variable can be used to refer to the common properties of
// all objects
// Its get memory only once in class area at time of class loading
/*
  -Instance variables(Iv) are declared in aclass outside a method.
  -class/static variables(Sv) are declared with static keyword in class outside method.
  
  -Iv are created when an obj is created with use of new keyword and get destroyed when
    object is destroyed
  -Sv are created when the program starts and destroyed when program stops  

  -Iv can be accessed directly by calling variable name inside the class
  -Sv can be acessed by calling with the class name
 */