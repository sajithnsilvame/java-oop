public class Overloading{

    public void meth(){
        System.out.println("method 1 is called..");
    }
    public void meth(int x){
        System.out.println("method 2 is called with passing int value is " + x);
    }
    public void meth(int p, int r){
        System.out.println("method 3 is called with passing two in value is " + p + " "+ r);
    }
    public void meth(double x){
        System.out.println("method 4 is called with passing double value is " + x);
    }

    public static void main(String[] args){

        System.out.println("in polymorphism we can overload the method by passing different type of agrgument and data types ");

        Overloading obj = new Overloading();
        obj.meth();
        obj.meth(2);
        obj.meth(5,10);
        obj.meth(5.301);

    }
}

