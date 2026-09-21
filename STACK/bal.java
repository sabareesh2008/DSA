
import java.util.Stack;

public class bal {
    public static void balance(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') stack.push(ch);
            else{
                while(!stack.isEmpty()){
                    if(ch=='}'&& stack.peek()=='{') stack.pop();
                   else  if(ch==')'&& stack.peek()=='(') stack.pop();
                    else if(ch==']'&& stack.peek()=='[') stack.pop();
                }
            }
          
        }
          if(stack.isEmpty()) System.out.println("VAlid");
            else System.out.println("Invalid");
    }
    public static void main(String[] args) {
        String a="(()))";
        balance(a);

    }
}
