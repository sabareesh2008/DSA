
import java.util.*;

class LCP167{
    public static void main(String[] args) {
        int[] arr={2,11,7,15};
        int target=9;
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr1={};
        for(int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if(map.containsKey(need)){
                arr1=new int[]{map.get(need),i+1};
            }
            map.put(arr[i],i+1);
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }

    }
}