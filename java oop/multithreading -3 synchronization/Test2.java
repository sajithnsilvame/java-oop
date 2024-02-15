class Display {
  synchronized void print() {

    Thread t = Thread.currentThread();

    for (int i = 0; i < 5; i++) {

      try {
        Thread.sleep(1000);
        System.out.println(t.getName() + " Hello");
      } catch (Exception e) {
        System.out.println(e);
      }

    }

  }

}

class T extends Thread {
  Display c;

  T(Display c) {
    this.c = c;
  }

  public void run() {
    c.print();
  }
}

public class Test2 {

  public static void main(String[] args) {
    Display obj = new Display();

    T t1 = new T(obj);
    T t2 = new T(obj);
    T t3 = new T(obj);

    t1.start();
    t2.start();
    t3.start();

  }
}
