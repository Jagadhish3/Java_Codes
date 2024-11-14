// // A shopping website requires users to enter their age during the registration process. 
// However, sometimes users accidentally enter their age as a string instead of a number. 
// Write a Java program that prompts the user to enter their age. 
// Handle the NumberFormatException if the input cannot be parsed into an integer. 
// If the input is valid print the age of the person otherwise print "Error: Invalid input"



// // Input format:

// // The input is the integer which represents the age.



// // Output format:

// // Print the age if the input is valid as shown in displayed test cases otherwise print "Error: Invalid input".
import java.util.*;
public class EH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String s=sc.nextLine();
            int n=Integer.parseInt(s);
            if(n<0){
                throw new InvalidAgeException();
            }
            System.out.println("Age: "+n);

        }catch(NumberFormatException e){
            System.out.println("Error: Invalid input");
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("Invalid Age");
    }
}
