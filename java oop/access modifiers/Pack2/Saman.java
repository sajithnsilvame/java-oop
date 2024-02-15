// package Pack2;

// public class Saman {
    
// }


package Pack2;

import Pack1.*   ;

public class Saman extends Kamal{ 
    
    public static void main(String[] args) {
        
        Kamal obj3 = new Kamal();

        //System.out.println(obj3.x);    x can access because x is public

        // System.out.println(obj3.y);   this will occurred the error because different package

        //System.out.println(obj3.z);    this will occurred the error because different package (but if inherited, z can access)

        //System.out.println(obj3.b);    this will occurred the error because b is private

        Saman objForInherit = new Saman();

        System.out.println(objForInherit.z);  //Now z can access because Kamal has inherited to this class 
    }
}
