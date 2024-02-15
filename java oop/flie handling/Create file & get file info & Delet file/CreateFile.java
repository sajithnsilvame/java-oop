import java.io.File;

public class CreateFile{

    public static void main(String[] args) {
        
        File obj = new File("file.txt");

        try{
            System.out.println(obj.createNewFile());

            // file informations 

            System.out.println(obj.getName()); // file.txt
            System.out.println(obj.exists());  // is there any file already? true
            System.out.println(obj.canWrite()); // can write? true
            System.out.println(obj.canRead()); // can read? true
            System.out.println(obj.getAbsolutePath()); // D:\java oop\file handling\file.txt
            System.out.println(obj.length()); // content lenth of file.txt

            // Delete file 

           /* if(obj.delete()){
                System.out.println(" file deleted.!");
            }
            else{
                System.out.println("ooh! no any file");
            }

            */
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}