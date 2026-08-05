import java.util.*;
public class prefix {
    public final static StringBuilder reverseInfix(String s){
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                str.setCharAt(i,')');
            }
            else if(str.charAt(i)==')'){
                str.setCharAt(i,'(');
            }
        }
        return str;
    }
    public static int precedence(char ch){
        if(ch=='^') return 3;
        else if(ch=='/' || ch=='*' || ch=='%') return 2;
        else if(ch=='+' || ch=='-' ) return 1;
        return -1;
    }
    public static StringBuilder prefix(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ') continue;
            else if(ch=='(') stack.push(ch);
            else if(Character.isLetterOrDigit(ch)) sb.append(ch);
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&stack.peek()!='('&&precedence(stack.peek())>=precedence(ch)){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb;
    }
    public static void main(String[] args) {
        String s="a+(b*c)";
        reverseInfix(s);
        System.out.println(prefix(s).reverse());

    }
}
