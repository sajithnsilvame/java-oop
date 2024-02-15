public class Kamal implements Student{

    public void eat(){
        System.out.println("eat");
    }
    public void drink(){
        System.out.println("drink");
    }
    public void run(){
        System.out.println("run");
    }
    
    public static void main(String[] args) {
        
        Student obj = new Kamal();

        System.out.println(Student.number);

        obj.eat();
        obj.drink();
        obj.run();
    }
}
