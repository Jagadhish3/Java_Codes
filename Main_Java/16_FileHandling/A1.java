import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class A1{
    public static void main(String args[]){
        // try{
        //     File myFile=new File("myFile.txt");
        //     myFile.createNewFile();
        //     System.out.println("Created");
            
        // }catch(Exception e){
        //     System.out.println("Error");
        // }

        try{
            FileWriter fileWriter=new FileWriter("myFile.txt");
            fileWriter.write("HI I am Sriram\nOkay");
            System.out.println("Successful");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Error");
        }

        try{
            File myFile=new File("myFile.txt");
            Scanner sc = new Scanner(myFile);
            StringBuilder sb=new StringBuilder("");
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);

                sb.append(line).append("\n");
            }
            System.out.println(sb.toString());
            System.out.println(findMaxWord(sb.toString()));
            System.out.println(reverseFile(sb.toString()));
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static String findMaxWord(String str){
        String[] words=str.split("\\s+");
        String maxWord="";
        int maxLength=0;
        for(String w:words){
            if(w.length()>maxLength){
                maxLength=w.length();
                maxWord=w;
            }
        }
        return maxWord;
    }
    public static String reverseFile(String str){
        String[] lines=str.split("\\n");

        StringBuilder sb=new StringBuilder();
        for(int i=lines.length-1;i>=0;i--){
            sb.append(lines[i]).append("\n");
        }
        return sb.toString();
    }
}