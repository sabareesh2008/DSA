
import java.util.Stack;

public class postfixEval {
    public final static int EvalPostfix(String postfix){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            if(ch==' ') continue;
            if(Character.isDigit(ch)) stack.push(ch-'0');
            else{
                int first=stack.pop();
                int sec=stack.pop();
                switch(ch){
                    case '+':
                        stack.push(sec+first);
                        break;
                    case '-':
                        stack.push(sec-first);
                        break;
                    case '*':
                        stack.push(sec*first);
                        break;
                    case '/':
                        stack.push(sec/first);
                        break;
                    case '%':
                        stack.push(sec%first);
                        break;
                    case '^':
                        stack.push(sec^first);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s="2 3 + 4 *";
        System.out.println(EvalPostfix(s));
    }
}
