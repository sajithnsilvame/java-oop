class A{
    int x = 10;
}

class B extends A{
    int x = 15;

    public void print(){
        System.out.println(super.x);
    }
}

public class SuperKeywordForVariable{

    public static void main(String[] args) {
        
        B obj = new B();
        
        obj.print();
    }
}