// Programa de Java para demostrar getClass()
public class JDC
{
    public static void main(String[] args)
    {
        Object obj = new String("JavadesdeCero");
        Class c = obj.getClass();
        System.out.println("Clase del Objeto obj es : "
                + c.getName());
    }
}