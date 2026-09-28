import java.util.*;

class dup{
    public static void main(String[] args){
        int[] arr={1,2,3,1};
        Set<Integer> s=new HashSet<>();
        for(int x:arr){
            if(s.contains(x)) {
                System.out.println("true");
                return;
            }
            s.add(x);
        }
        System.out.println("false");
    }
}