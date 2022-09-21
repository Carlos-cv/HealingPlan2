public class Controller {
    int result;
    String resultStr;
    PhysicsOperations physics = new PhysicsOperations();
    Operations maths = new Operations();
    PhysicsInputParameters physicsParameters = new PhysicsInputParameters();
    InputParameters parameters = new InputParameters();
    public Controller(int x, int y) throws InvalidValue {
        // Condition to determine which function should be call
        if(x == 1 && y == 1){
            result = physics.distanciaAc(physicsParameters.physicsInputs(y));
            System.out.println("The distance is: " + result);
        } else if(x == 1 && y == 2){
            result = physics.velocidadAc(physicsParameters.physicsInputs(y));
            System.out.println("The velocity is: " + result);
        } else if(x == 1 && y == 3){
            result = physics.frecuencia(physicsParameters.physicsInputs(y));
            System.out.println("The frequency is: " + result);
        } else if(x == 2 && y == 1){
            resultStr = maths.palindrome(parameters.inputs());
            System.out.println(resultStr);
        } else {
            throw new InvalidValue("The value selected is not a valid option, please select a number of the options available");
        }
    }
}
