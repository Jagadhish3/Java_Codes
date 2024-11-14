import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Intro3 {
    public static void main(String[] args) {
        try{
            File file = new File("MyFile");
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
