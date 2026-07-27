import java.util.*;
public class LCP217 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        Set<Integer> s= new HashSet<>();
        for(int x: arr){
            s.add(x);
            if(s.contains(x)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
