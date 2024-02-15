public class OldPhone{
    
    String name = "nokia";

    void call(){
        System.out.println("take a call from " + name);
    }
    void msg(){
        System.out.println("Send msgs from " + name);
    }

    public static void main(String[] args) {
        
        OldPhone obj = new OldPhone();

        System.out.println(obj.name);
        obj.call();
        obj.msg();
        
        NewPhone object = new NewPhone();
        object.internet();
    }
}