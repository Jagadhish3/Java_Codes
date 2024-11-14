// Write a Java program that calculates the average of a list of numbers entered by the user. 
// Implement exception handling to handle the scenario where the user enters a non-numeric value instead of a number.

// Your program should repeatedly prompt the user to enter a number until 
// they enter a non-empty string to indicate they're done entering numbers. 
// Then, calculate and print the average of the entered numbers.
import java.util.*;
public class EH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int c=0;
        try{
            while(true){
                String s=sc.nextLine();
                if(s.isEmpty()){
                    break;
                }
                int n=Integer.parseInt(s);
                sum+=n;
                c++;
            }
        }catch(NumberFormatException e){
            System.out.println("Not a valid integer");
        }
        System.out.println((double)sum/c);
    }
}
