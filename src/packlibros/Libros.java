//Cambiar las variables de instancia a protected
package packlibros;
public class Libros {
    //Ahora están protegidas
    String titulo;
    String autor;
    int anio;
    public Libros(String t, String a, int d){
        titulo=t;
        autor=a;
        anio=d;
    }
    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anio);
        System.out.println();
    }
}