class Student{
    int age;
    String school;
    String name;

    Student(int age, String school, String name){
        this.age = age;
        this.school = school;
        this.name = name;
    }
}
class Kamal extends Student{

    int marks;

    Kamal(int age, String school, String name, int marks){
        
        super(age, school, name);
        this.marks = marks;
    }
}

public class SuperKeywordForConstructor {
    
    public static void main(String[] args) {
        Kamal obj = new Kamal(15, "my school", "my name", 75);

        System.out.println(obj.school);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.marks);
        
    }
}
