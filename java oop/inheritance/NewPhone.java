public class NewPhone extends OldPhone {

   String brandName = "Apple";
   
   void internet(){
        System.out.println("Access internet from " + brandName);
   }

   public static void main(String[] args) {

        /* Single inheritance */

       NewPhone obj1 = new NewPhone();
       
       System.out.println(obj1.brandName);
       obj1.internet();
       
       obj1.call();
       obj1.msg();


       OldPhone obj2 = new OldPhone();
       
       obj2.call();
       obj2.msg();
   }
    
    
}
