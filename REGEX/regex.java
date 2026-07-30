import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
    public static void main(String[] args){
        String s="abcabcbabcbacbacbacbacbacb";
        Pattern p = Pattern.compile("abc");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group()+" Starts with " +m.start()+" Ends with "+m.end());
        }
    }
}
