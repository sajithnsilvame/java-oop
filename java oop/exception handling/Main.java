import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        try{
            System.out.print("Enter first number: ");
            a = scanner.nextInt();

            System.out.print("Enter second number: ");
            b = scanner.nextInt();

            c = a/b;
            System.out.println("Answer is: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("can not devide by zero ");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter the int value ");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye!");
        }

        
    }
}