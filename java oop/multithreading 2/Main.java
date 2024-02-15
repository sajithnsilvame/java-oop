class A implements Runnable {
    public void run() {

        for (int i = 0; i < 20; i++){
            System.out.println("Java");

            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("Programming");

            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

public class Main{

    public static void main(String[] args) {
        
        A obj1 = new A();
        Thread ob1 = new Thread(obj1);
        ob1.start();

        /* ******************* */

        try{
            Thread.sleep(50);
        }catch(Exception e){}

        B obj2 = new B();
        Thread ob2 = new Thread(obj2);
        ob2.start();
    }
}