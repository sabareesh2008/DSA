import java.util.Arrays;
import java.util.HashMap;

public class LCP242 {
    public static void main(String[] args) {
        String s="sabareesh",t="sabarsheew";
        if(s.length()!=t.length()){
            System.out.println("False");
            return;
        } 
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
       for(char x:t.toCharArray()){
        if(!map.containsKey(x)) {
            System.out.println(false);
            return;
        }
        map.put(x,map.get(x)-1);
        if(map.get(x)==0) map.remove(x);
       }
       System.out.println("True");

       char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println(true);
    }
}
