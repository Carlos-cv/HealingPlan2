//Retornando un objeto String
class MsgError {
    //Códigos de Error
    final int CERO =0;
    final int UNO = 1;
    final int DOS = 2;
    final int TRES = 3;
    String msgs[]={
            "ERROR CERO",
            "ERROR UNO",
            "ERROR DOS",
            "ERROR TRES"
    };
    //Retornando un mensaje de error
    String getMsgError(int i){
        if (i>=0&i<msgs.length)
            return msgs[i];
        else
            return "CÓDIGO DE ERROR INVÁLIDO";
    }
}

class FinalD {
    public static void main(String[] args) {
        MsgError error=new MsgError();
        System.out.println(error.getMsgError(error.CERO));
        System.out.println(error.getMsgError(error.DOS));
    }
}