import java.io.FileWriter;

public class WriteFile_1{

    public static void main(String[] args) {
        String java = "\nJava is a high-level language";
        try{
            FileWriter wrt = new FileWriter("MyFile.txt", true); // make the connection using FileWriter Class
            //wrt.write(java); 
            wrt.append(java);
            wrt.close(); // close the connection using close() method.


            /* Note: when we use the write() method, text will create in file. 
            But next time if changed the string valu of java "Hello Java" 
            will be remove and replace new value that we set.

            To avoid this case java has introduced a append() method.
            when we use this method we have to set booleanvalu after file name.

            Example:

            FileWriter wrt = new FileWriter("MyFile.txt", true);
            wrt.append(java);
            wrt.close();
            
            */

            
        } catch(Exception e){
            System.out.println(e);
        }
    }
}