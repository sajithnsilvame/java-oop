public class MyArr <T>{

        T[] arr = (T[]) new Object[3];


    public static void main(String[] args) {

       /* Object arr[] = new Object[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = "Hello";

        int number;
        for(int i = 0; i< arr.length; i++) {

            // number = (Integer)arr[i];
            // System.out.println(number);

            //System.out.println(arr[i]);

            number = (Integer)arr[i];
            System.out.println(number);
        } */

        MyArr obj = new MyArr();

        obj.arr[0] = 10;
        obj.arr[1] = 20;
        obj.arr[2] = "Hello";

        for(int i = 0; i < 3; i++) {
            System.out.println(obj.arr[i]);
        }

    }
}
