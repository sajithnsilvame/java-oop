enum Exam{
    SUBJECT,
    RESULTS,
    AVARAGE;
}

enum Week{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}



public class Main{

    enum People{
        SAJITH,
        NISHANTHA,
        SILVA;
    }

    /* NOTE: 
    An enum is a special "class" that represents a group of constants.

    1. we can create enum class inside a class or outside a class.
    2. enum class is static.
    3. enum class is public
    4. it should be constant
    5. we can not create a object using enum class.
    
    */

    public static void main(String[] args) {
        
        People p1 = People.SAJITH;
        Exam e1 = Exam.SUBJECT;
        Week day = Week.MONDAY;

        System.out.println(p1);
        System.out.println(e1);
        System.out.println(day);
    }
}