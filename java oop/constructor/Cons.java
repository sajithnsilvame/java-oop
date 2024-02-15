public class Cons {

    String name;

    Cons(){
        name = "kamal";
        System.out.println("Welcome");
    }
    Cons(int x){
        System.out.println(x);
    }
    void meth1(){
        System.out.println("Hello");
    }
public static void main(String[] args) {
    
    Cons obj = new Cons();
    obj.meth1();

    System.out.println(obj.name);

    Cons obj1 = new Cons(20);
    
}
}
