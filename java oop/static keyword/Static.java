public class Static {
    int x = 4;
    static int y = 5;

    void meth1(){
       System.out.println("non-satic method");
    }
    static void meth2() {
        System.out.println("satic method");
    }
    
    public static void main(String[] args) {
        
        System.out.println(y + " is static a atribute"); 
        meth2();

        // System.out.println(x); can not access
        // meth1(); can not access

        Static obj = new Static();

        System.out.println(obj.x + " is static a atribute");
        obj.meth1();
    }
}
