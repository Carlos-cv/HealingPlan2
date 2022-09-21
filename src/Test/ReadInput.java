import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class ReadInput
{
    public static void main (String[]args)
    {
        BufferedReader fis;
        try
        {
            fis = new BufferedReader(new FileReader("C:/Users/carlos.cruz.vega/Documents/Java/HealingPlan2/src/Test/Test.txt"));
            String line32 = fis.readLines(fis.get("Test.txt")).get(2);
            System.out.println ("Datos en el archivo: ");
            // Lee el primer byte
            /*String read = readLine()
            int ch = fis.read ();
            while (ch != -1)
            {
                System.out.print ((char) ch);
                // Lee el siguiente byte del archivo
                ch = fis.read ();
            }
            fis.close ();*/
        }
        catch (Exception e)
        {
            e.getStackTrace ();
        }
    }
}