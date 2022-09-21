
class Empleado {  //clase general
    public static int base = 400;
    public int sts = 5;
    int salario() {
        return base;
    }
}

class Gerente extends Empleado { //aquí estamos sobreescribiendo el método de la clase principal
    @Override
    int salario() {
        return base + 200;
    }
}

class Supervisor extends Empleado {
    @Override
    int salario() {
        return base + 100;
    }
}

class Main { // con esto vamos a imprimir el salario de cualquier trabajador

    static void imprimirSalario(Empleado Empleado) {
        System.out.println(Empleado.salario());
    }

    public static void main(String[] args) {

        Empleado Gerente = new Gerente();
        System.out.println("El salario del gerente es: ");
        imprimirSalario(Gerente);

        Empleado Supervisor = new Supervisor();
        System.out.println("El salario del supervisor es: ");
        imprimirSalario(Supervisor);

        Empleado Empleado1 = new Empleado();
        System.out.println("El salario del empleado es: ");
        imprimirSalario(Empleado1);
    }
}