class Student{
    public String stuName;
    public int Rno;
    public static String uniName;

    public void  output(){
        System.out.println(stuName + " " + Rno + " " + uniName);
    }
}


class A3Static {
    public static void main(String args[]){
        Student s1 = new Student();
        
        s1.stuName="Sri";
        s1.Rno=1;
        s1.uniName="Rebel";
        
        Student s2 = new Student();
        
        s2.stuName="Salaar";
        s2.Rno=2898;
        s2.uniName="Rebel";

        s1.output();
        s2.output();
    }
}
