import java.util.ArrayList;
class Student{
    private ArrayList<String> l1;
    Student(){
        l1=new ArrayList<>();
    }
    void addStudent(String name){
        l1.add(name);
    }
    void removeStudent(String name){
        if(l1.contains(name)){
            l1.remove(name);
        }else{
            System.out.println("No student with name: "+name);
        }
    }
    void displayAllStudents(){
        if(l1.isEmpty()){
            System.out.println("No students");
        }else{
            System.out.println(l1);
        }
    }

}
public class Q2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.addStudent("Deva");
        s1.addStudent("Sriram");

        s1.displayAllStudents();

        s1.removeStudent("Rohit");
        s1.removeStudent("Deva");

        s1.displayAllStudents();
    }
}
// Create a Java program to manage a list of student names using ArrayList. The program should allow users to add new student names, remove existing student names, and display all student names.

// Your program should include the following methods:

// addStudent(String name): This method adds a new student name to the list.
// removeStudent(String name): This method removes a student name from the list.
// displayAllStudents(): This method displays all the student names stored in the list.
// Write a Java program that implements the above methods and demonstrates their functionality.