import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile_2 {
    public static void main(String[] args) {
        
        try{

            BufferedWriter bfw = new BufferedWriter(new FileWriter("data.txt"));

            bfw.write("Helloo");
            bfw.newLine(); // it breaks a line
            bfw.write("Hello World");
            bfw.close();

            // Also we can use append() method.

            /* 
            Note: Why we use BufferedWriter? it is speed than FileWriter.
                  So we can write data very fast.
            
            */
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
