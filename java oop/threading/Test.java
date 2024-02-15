class A extends Thread{

   public void run(){
        System.out.println("Hello");
        // there are two ways to make thread
        // 1. using Thread class.
                /* if you use this way you have to put the method name as run() 
                   and call the method using start() method. */
         
    }
}

class B implements Runnable{

    public void run() {
        System.out.println("Welcome");

        // 2. using runable interface.
                /* if you use this way to make thread you have to implements the 
                   Runnable interface. */
    }
}

public class Test{

    public static void main(String[] args) {
        
            A obj = new A();
            obj.start();

            /*  ********************** */

            B obj1 = new B();
            Thread ob = new Thread(obj1);

            ob.start();
    }
}