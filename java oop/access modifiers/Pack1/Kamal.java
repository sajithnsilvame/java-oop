 /*package Pack1;
 import Pack2.Saman; // import the Saman class 

 public class Kamal{

     public static void main(String[] args){
            Kamal obj = new Kamal();
            Nimal obj1 = new Nimal();
            Saman obj2 = new Saman();
    }
 } */

package Pack1;

public class Kamal{

    public int x = 10;
    int y =20; // default 
    protected int  z = 30; 
    private int b = 40;

    //protected int x = 10; // this is inherited to the Saman class 
    
    

    public static void main(String[] args) {
        
        Kamal obj1 = new Kamal();
       
      
        //System.out.println(obj1.x);   //x can access because x is public 

        System.out.println(obj1.y);   //y can access because y is default and same package

        //System.out.println(obj1.z);   z can access because z is protected 

        //System.out.println(obj1.b);   b can access because b is private
    }
} 
