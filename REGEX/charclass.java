
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class charclass {
    public static void main(String[] args){
        String s="abacabacabacaba!@#$%^&*&%^%^%&$&$@";
        Pattern p =Pattern.compile("[^a-zA-Z0-9]"); 
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }

}
