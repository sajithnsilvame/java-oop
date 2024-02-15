import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile_3 {
    
    public static void main(String[] args) {
        
        File file = new File("file1.txt");

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

           // System.out.println(reader.readLine());
           // System.out.println(reader.readLine());

           String str;
           while((str = reader.readLine()) != null){
               System.out.println(str);
           }

            reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
