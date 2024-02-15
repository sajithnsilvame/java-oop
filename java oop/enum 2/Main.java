public class Main{

    enum WorkDays{
        MONDAY, TUESDAY, WEDNESDAY;
    }

    public static void main(String args[]){

        WorkDays day1 = WorkDays.MONDAY;
        WorkDays day2 = WorkDays.TUESDAY;
        WorkDays day3 = WorkDays.WEDNESDAY;

        switch(day2){
            case MONDAY:
            System.out.println("Today is monday");
            break;

            case TUESDAY:
            System.out.println("Tomorrow is tuesday");
            break;

            case WEDNESDAY:
            System.out.println("Day after day is wednesday");
            break;
        }
    }
}