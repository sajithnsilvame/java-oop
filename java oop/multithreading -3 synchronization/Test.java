class Display{
    void print(){

        Thread t = Thread.currentThread();
        synchronized(this){

            for(int i = 0; i<5; i++){

                try{
                    Thread.sleep(1000);
                    System.out.println(t.getName() + " Hello");
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
            }
        }
        
    }

    synchronized void hello(){

        Thread p = Thread.currentThread();

            for(int i = 0; i<10; i++){

                try{
                    Thread.sleep(50);
                    System.out.println(p.getName() + " World");
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        
    }
}

class T extends Thread{
    Display c;

    T(Display c){
        this.c = c;
    }

    public void run(){
        c.print();
    }
}

class P extends Thread{
    Display m;

    P(Display m){
        this.m = m;
    }

    public void run(){
        m.hello();
    }
}

public class Test{

    public static void main(String[] args) {
        Display obj = new Display();
        
        T t1 = new T(obj);
        T t2 = new T(obj);
        T t3 = new T(obj);

        P p1 = new P(obj);

        t1.start();
        t2.start();
        t3.start();

        p1.start();
    }
}