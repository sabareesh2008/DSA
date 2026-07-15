
import java.util.Stack;



public class BracketCheck {
  
    static Boolean isValid(String exp){
        Stack<Character> stack = new Stack();
        for(char c: exp.toCharArray()){
            if(c=='('||c=='{'||c=='[') stack.push(c);
            else if(c=='}'||c==']'||c==')'){
                if(stack.isEmpty()) return false;
                char current = stack.pop();
                if(current=='{' && c!='}' || current == '[' && c!=']'||
                current == '(' && c!=')') return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String exp="sa{sa}sdas{DSAS{ada}sdA}dasD{asdAS}D";
        System.out.println(isValid(exp));
    }
}
