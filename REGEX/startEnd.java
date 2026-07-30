
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class startEnd {
    public static void main(String[] args) {
        String s="abacabacabacabacabacab";
        Pattern p = Pattern.compile("^a");// $ for ending "a$"
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
