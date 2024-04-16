import java.io.File;
import java.io.IOException;

public class Intro {
    public static void main(String[] args) {
        
        
        try{
            File file=new File("MyFile");

            if(file.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Unexpected exception occured");
            e.getStackTrace();
        }
    }
}
