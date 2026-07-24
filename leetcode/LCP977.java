import java.util.*;
public class LCP977 {
    public static void main(String[] args){
        int[] arr={3,2,1,4,5};
        
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
