
import java.util.HashMap;

public class anagram{
    public static void main(String[] args){
        String s="saba",t="abas";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x: s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }       
    }
}