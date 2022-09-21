import java.io.FileInputStream;
public class FileInputStreamDemo
{
    public static void main (String[]args)
    {
        try
        {
            FileInputStream fis = new FileInputStream ("C:/Users/carlos.cruz.vega/Documents/Java/HealingPlan2/src/Streams/archivo.txt");
            System.out.println ("Datos en el archivo: ");
            // Lee el primer byte
            int ch = fis.read ();
            while (ch != -1)
            {
                System.out.print ((char) ch);
                // Lee el siguiente byte del archivo
                ch = fis.read ();
            }
            fis.close ();
        }
        catch (Exception e)
        {
            e.getStackTrace ();
        }
    }
}