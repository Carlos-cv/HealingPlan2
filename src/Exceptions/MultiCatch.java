// Uso de multi-catch
// Este código requiere JDK7 o superior
class MultiCatch {
    public static void main(String[] args) {
        int a=28, b=0;
        int resultado;
        char chars[]={'A','B','C'};
        for (int i=0; i<2;i++){
            try {
                if (i==0)
                    resultado=a/b; //genera un ArithmeticException
                else
                    chars [5]='X'; //genera un ArrayIndexOutOfBoundsException
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Excepción capturada: "+e);
            }
        }
        System.out.println("Después del multi-catch");
    }
}