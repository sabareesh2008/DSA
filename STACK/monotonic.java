import java.util.ArrayDeque;
import java.util.Deque;

public class monotonic {
    public static void main(String[] args){
       int[] arr={1,7,9,5,8};
       Deque<Integer> stack = new ArrayDeque<>();
       Deque<Integer> stack1 = new ArrayDeque<>();
       for(int x:arr){
        while(!stack.isEmpty() && stack.peek()<x){
            stack.pop();
        }
        stack.push(x);
       }
       for(int x:arr){
        while(!stack1.isEmpty() && stack1.peek()>x){
            stack1.pop();
        }
        stack1.push(x);
       }

       System.out.println(stack);
       System.out.println(stack1);
    }
}
