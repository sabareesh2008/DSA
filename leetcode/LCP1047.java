
import java.util.Stack;

public class LCP1047 {
    public static void main(String[] args){
        String a="abbaca";
        Stack<Character> stack = new Stack<>();
        for(char x:a.toCharArray()){
           if(!stack.isEmpty()&&stack.peek()==x){
            stack.pop();
           }
           else stack.push(x);
        }
        StringBuilder n = new StringBuilder();
        while(!stack.isEmpty()){
            n.append(stack.pop());
        }
        System.out.println(n.reverse().toString());
    }
}
