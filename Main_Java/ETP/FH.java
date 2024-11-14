// Practice Question (Easy Level):

// Write a Java program that reads a text file named "input.txt" and counts the number of lines in the file. 
// Then, write the count to another text file named "output.txt".

// Here's a step-by-step guide to help you:

// 1. Open the "input.txt" file for reading.
// 2. Read each line of the file and count the number of lines.
// 3. Close the "input.txt" file.
// 4. Open the "output.txt" file for writing.
// 5. Write the count of lines to the "output.txt" file.
// 6. Close the "output.txt" file.

// Make sure to handle any potential exceptions that may occur during file operations.

// Once you've written your implementation, submit it, and I'll check it for you!
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH {
    public static void main(String[] args) {
        File myFile=new File("input.txt");
        File myFile1=new File("output.txt");
        StringBuilder sb=new StringBuilder();
        try{
            myFile.createNewFile();
            System.out.println("New File Created");
        }catch(Exception e){
            System.out.println("Error creating file");
        }
        try{
            FileWriter fw=new FileWriter(myFile);
            fw.write("Hi my name is Sriram.\nI am practicing File Handling.\nThank you.");
            fw.close();
        }catch(IOException e){
            System.out.println("Error writing to file");
        }
        try{
            FileReader fr=new FileReader(myFile);
            BufferedReader br=new BufferedReader(fr);
            String line;
            int c=0;
            
            while((line=br.readLine())!=null){
                c++;
                
            }
            sb.append(c);
            br.close();
            fr.close();
            

        }catch(IOException e){
            System.out.println("Error reading");
        }
        try{
            FileWriter fw=new FileWriter(myFile1);
            fw.write("Count of lines: "+sb.toString());
            fw.close();
        }catch(IOException e){
            System.out.println("Error writing to file");
        }

        

    }
}
