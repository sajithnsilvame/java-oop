public class Main {
    
    public static void main(String[] args) {
        
        Student obj = new Student();

        obj.setName("John");
        System.out.println(obj.getName());

        obj.setAge(23);
        System.out.println(obj.getAge());

        obj.setStatus("married");
        System.out.println(obj.getStatus());
        
    }
}
