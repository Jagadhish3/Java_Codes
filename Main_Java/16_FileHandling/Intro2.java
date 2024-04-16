import java.io.IOException;
import java.io.FileWriter;
public class Intro2 {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("MyFile");

            fw.write("Writing some demo text");

            fw.close();
            System.out.println("closed successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
