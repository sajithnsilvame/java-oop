class Student <DataType>{
    void print(DataType x){

        DataType b = (DataType)x;
        System.out.println(b);
    }
}

public class Test{

    public static void main(String[] args) {
        
        Student<Integer> obj = new Student();
        Student<String> obj1 = new Student();
        Student<Double> obj2 = new Student();

        obj.print(50);
        obj1.print("Hello");
        obj2.print(26.56);
    }
}