interface MiInterfaz {
    //Esto es una declaración normal de un método
    //Esto no define la implementación de default
    int getUsuario();
    //Esto es un método default
    default int getAdmin(){
        return 1;
    }
    //Esto es un método static de interfaz
    static int getUniversal(){
        return 0;
    }
}

class MiIntImp implements MiInterfaz {
    //Solo getUsuario() definida en MiInterfaz
    //debe implementarse
    public int getUsuario(){
        return 100;
    }
}

//Uso del Metodo Default
public class MetDefaultDemo {
    public static void main(String[] args) {
        MiIntImp ob=new MiIntImp();
        //Puede llamar a getUsuario(), porque
        //está explícitamente implementado por MiIntImp
        System.out.println("Usuario: "+ob.getUsuario());
        //También puede llamar a getAdmin(), porque
        //está implementado por defecto
        System.out.println("Admin: "+ob.getAdmin());
        //Puede llamar la funcion estatica
        System.out.println("Universal: "+MiInterfaz.getUniversal());
    }
}