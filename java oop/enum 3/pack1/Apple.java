package pack1;

public class Apple {
    
    public static void main(String[] args) {
        
       /* Orange amal = Orange.AMAL;
        Orange nimal = Orange.NIMAL;
        Orange  kamal = Orange.KAMAL;
        Orange saman = Orange.SAMAN;

        System.out.println(amal + " is a " + amal.getDetails());
        System.out.println(nimal + " is a " + nimal.getDetails());
        System.out.println(kamal + " is a " + kamal.getDetails());
        System.out.println(saman + " is a " + saman.getDetails());


        */


        /* Just for fun! LOl  */

       /* for(int i = 0; i < 5; i++){

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.printf("%s\t\n", kamal.getDetails());
        }

        */

        // How to print all the data in the enum class using enhance for loop //

        for(Orange allInfo : Orange.values()){
            System.out.printf("%s\t%s\n", allInfo, allInfo.getDetails());
        }
    }
}