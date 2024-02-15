import java.io.FileReader;

public class ReadFile_2 {
    
    public static void main(String[] args) {
        
       
        try{
            FileReader reader = new FileReader("file1.txt");

           // System.out.println((char)reader.read());

           int i;
           while((i = reader.read()) != -1){
               System.out.print((char)i);
           }

            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
