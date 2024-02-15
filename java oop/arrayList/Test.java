import java.util.ArrayList;

public class Test{

    public static void main(String[] args) {
        
        ArrayList<Integer> arr  = new ArrayList(10);

        arr.add(5); // add(value);
        arr.add(30);

        System.out.println(arr);
        arr.add(0, 99); // add 99 to the 0 index add(index, value);

        System.out.println(arr);

        arr.set(1, 60); // set a value to a specific index 
        System.out.println(arr);

        System.out.println(arr.get(2)); 

        System.out.println(arr.indexOf(60)); 

        System.out.println(arr.contains(30)); // is 30 is available in arr 

        arr.remove(0); // remove a value in 0 index

        System.out.println(arr);

        // print all the elements in the arrayList

        // 01
        System.out.println("using for loop");

        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        // 02
        System.out.println("using wrapper class");

        for(Integer x: arr){

            System.out.println(x);
        }

        // 03
        System.out.println("using for each");

        arr.forEach(x -> {
            System.out.println(x);
        });

        

    }
}