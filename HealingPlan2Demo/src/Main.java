import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner operation = new Scanner(System.in);
        int operator = 0;
        try {
            System.out.println("Select the number operation to be performed: 1)Physics 2)Operation");
            final int option = operation.nextInt();
            if (option == 1) {
                System.out.println("Select the function to be performed: 1)Distance 2)Velocity 3)Frequency");
                operator = operation.nextInt();
            } else if(option == 2) {
                System.out.println("Select the function to be performed: 1)Palindrome");
                operator = operation.nextInt();
            }
            Controller controller = new Controller(option, operator);
        } catch (InputMismatchException ex){
            System.out.println("Incorrect type value");
        } catch (InvalidValue ex) {
            System.out.println(ex);
        }
    }
}
