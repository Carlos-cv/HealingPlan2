import java.util.Scanner;


public class InputParameters {
    Scanner values = new Scanner(System.in);
    public String inputs() {
            System.out.println("Write the value to be verified");
            String word = values.nextLine();
        return word;
    }
}
