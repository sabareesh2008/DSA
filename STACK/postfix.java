
import java.util.Stack;

public class postfix{
    public static int precedence(char p){
       
        if(p=='+'||p=='-') return 1;
        else if(p=='*'||p=='/'||p=='%') return 2;
        else if(p=='^') return 3;
        return -1;
    }
    public final static StringBuilder postfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(ch==' ') continue;
            else if(ch=='(') stack.push(ch);
            else if(Character.isLetterOrDigit(ch)) postfix.append(ch);
            else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                while(!stack.isEmpty()&&stack.peek()!='('&&precedence(stack.peek())>=precedence(ch)){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix;
    }
    public static void main(String[] args){
        String infix=" A+B*C-D";
        StringBuilder res = postfix(infix);
       
        System.out.println(res);
    }
    
}