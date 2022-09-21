public class Test
{
    public static void main(String args[])
    {
        Test obj= null;
        obj.staticMethod();
        obj.nonStaticMethod();
    }

    private static void staticMethod()
    {
        //Puede ser llamado por referencia nula
        System.out.println("metodo estatico, puede ser llamado por referencia nula");

    }

    private void nonStaticMethod()
    {
        //Can not be called by null reference
        System.out.print(" Metodo no estatico- ");
        System.out.println("no puede ser llamado por referencia nula");

    }

}