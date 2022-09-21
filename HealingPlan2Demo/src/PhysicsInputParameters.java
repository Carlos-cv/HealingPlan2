import java.util.Scanner;

public class PhysicsInputParameters {
    public int[] physicsInputs(int y) {
        int[] parameters = new int[0];
        Scanner values = new Scanner(System.in);
        if (y == 1) {
            System.out.println("Write the initial distance");
            int initialDistance = values.nextInt();
            System.out.println("Write the initial velocity");
            int initialVelocity = values.nextInt();
            System.out.println("Write the time");
            int time = values.nextInt();
            System.out.println("Write the acceleration");
            int acceleration = values.nextInt();
            parameters = new int[]{initialDistance, initialVelocity, time, acceleration};
        } else if(y == 2){
            System.out.print("Write the initial velocity: ");
            int initialVelocity = values.nextInt();
            System.out.print("Write the time: ");
            int time = values.nextInt();
            System.out.print("Write the acceleration: ");
            int acceleration = values.nextInt();
            parameters = new int[]{initialVelocity, time, acceleration};
        } else if(y == 3){
            System.out.print("Write the wavelength: ");
            int wavelength = values.nextInt();
            parameters = new int[]{wavelength};
        }
        return parameters;
    }
}
