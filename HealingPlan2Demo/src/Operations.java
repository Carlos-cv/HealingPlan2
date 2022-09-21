import functions.*;

public class Operations implements Functions {
    @Override
    public String palindrome(String str){
        String palindromo;
        StringBuilder reverseStr = new StringBuilder(str);
        if (str.toString().toLowerCase().equals(reverseStr.reverse().toString().toLowerCase())){
            palindromo = str + " Es palindromo";
        } else {
            palindromo = str + " No es palindromo";
        }
        return palindromo;
    }
}
