class P{
    void show(){
        System.out.println("Hi");
    }
}
class Q extends P{
    
    void show(){
        super.show();
        System.out.println("Hello");
    }
}

public class SuperKeywordForMethod {
    
    public static void main(String[] args) {
        
        Q obj = new Q();

        obj.show();
    }
}
