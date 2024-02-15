import java.io.File;
import java.util.Scanner;

public class ReadFile_1{

    public static void main(String[] args) {
        
        File file = new File("file1.txt");

        try{
            // file.createNewFile();

            Scanner reader = new Scanner(file);

           /*
            
            System.out.println(reader.nextLine());
            System.out.println(reader.nextLine());
            
            if we know the number of lines in the file we can use this.
            But exactly we don't know the number of lines we can use while loop.
            */

            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());

                /* 
                reader.hasNextLine()
                
                in this condition it is check whether 
                there is a next line or not. If conditionis true,
                print the all of lines and condition is false exit the program. 
                   
                */
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}