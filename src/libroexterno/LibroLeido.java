//package libroexterno;//Demostración de import
import packlibros.Libros;

public class LibroLeido {
    public static void main(String[] args) {
        //Ahora nos referimos directamente a Libros
        //Sin calificación
        Libros libros= new Libros("Aprendiendo a Programar en Java","Sonia Jaramillo",2015 );
        libros.mostrar();
    }
}