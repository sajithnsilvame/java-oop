// package Pack1;

/* public class Nimal { 
        // without public (default) no error generate.
    } */


package Pack1;

public class Nimal { 

    public static void main(String[] args) {
        
        Kamal obj2 = new Kamal();

        //System.out.println(obj2.x);   x can access because x is public 

        //System.out.println(obj2.y);   x can access because x is default and same package

        //System.out.println(obj2.z);   x can access because x is protected 

        //System.out.println(obj2.b);   x can access because x is private 
    }
}
