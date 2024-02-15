public class Main{

   
        String name;
        String color;
        int ram;

        public void call(){
            System.out.println("take a call from " + name);
        }
        public void browseInternet(){
            System.out.println("access internet");
        }
    

    public static void main(String[] args){

        Main phone1 = new Main();

        phone1.name = "samsung";
        phone1.color = "black";
        phone1.ram = 8;

        System.out.println(phone1.name);
        System.out.println(phone1.color);
        System.out.println(phone1.ram);

        phone1.call();
        phone1.browseInternet();

        Main phone2 = new Main();

        phone2.name = "apple";
        phone2.color = "gold";
        phone2.ram = 16;

        System.out.println(phone2.name);
        System.out.println(phone2.color);
        System.out.println(phone2.ram);

        phone2.call();
        phone2.browseInternet();


    }


}