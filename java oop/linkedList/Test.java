import java.util.LinkedList;
import java.util.List;

public class Test{

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>(List.of(1,2,3,5));

        list.add(12);
        System.out.println(list);

        System.out.println(list.contains(12));
        

        list.set(3, 4);
        System.out.println(list);
        System.out.println(list.indexOf(12)); // index of(object)

        System.out.println(list.get(1)); // give the value of 1 index. get(index)

       /* list.forEach(n -> {
            System.out.print(n + " ");
        });

        */

       /* for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }

        */

       /* for(Integer x: list){
            System.out.println(x);
        }

        */

        LinkedList<String> emp = new LinkedList<String>();

        for(int i = 0; i < 5; i++){
            emp.add("Java is powerful");
        }

        
        System.out.println(emp);
        System.out.println("Size of LinkedList : " +emp.size());



    }
}