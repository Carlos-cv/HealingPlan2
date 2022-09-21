import java.util.Scanner;
public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);

    }
}