public class LatestPhone extends NewPhone{
    
    void camera(){
        System.out.println("take a picture");
    }

    public static void main(String[] args) {

        /* multilevel inheritance */
        
        LatestPhone obj3 = new LatestPhone();

        obj3.camera();  // from LatestPhone
        obj3.internet();  //from NewPhone
        obj3.call(); // from OldPhone
        obj3.msg();  // from OldPhone

    }
}
