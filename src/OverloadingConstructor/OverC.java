//Programa Java para ilustrar el rol de this()
// en la sobrecarga del constructor
class OverC
{
    double largo, ancho, alto;
    int numero;
    // Constructor utilizado cuando todas las dimensiones
    // se especifican
    OverC(double w, double h, double d, int num)
    {
        largo = w;
        ancho = h;
        alto = d;
        numero = num;
    }
    // Constructor utilizado cuando no se especificaron dimensiones
    OverC()
    {
        // Vacio
        largo = ancho = alto = 0;
    }
    // Constructor utilizado cuando solo se especifica numero
    OverC(int num)
    {
        // this() se utiliza para llamar al constructor predeterminado
        // desde el constructor con parámetros
        this();
        numero = num;
    }
    public static void main(String[] args)
    {
        // crear DemoSCT usando solo numero
        OverC DemoSCT1 = new OverC(5);
        // obteniendo el valor inicial de largo en DemoSCT1
        System.out.println(DemoSCT1.largo);
    }
}
