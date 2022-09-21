// Ejemplo de bloque estático
class StaticDemo
{
    static double raizDe2;
    static double raizDe3;
    static {
        System.out.println("Dentro del bloque estático.");
        raizDe2=Math.sqrt(2.0);
        raizDe3=Math.sqrt(3.0);
    }
    StaticDemo (String msg){
        System.out.println(msg);
    }
}
class Estatico{
    public static void main(String[] args) {
        StaticDemo ob= new StaticDemo ("Dentro del Constructor.");
        System.out.println("La raíz cuadrada de dos es: "+StaticDemo.raizDe2);
        System.out.println("La raíz cuadrada de tres es: "+StaticDemo.raizDe3);
    }
}