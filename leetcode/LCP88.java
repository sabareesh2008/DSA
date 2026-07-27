import java.util.*;
public class LCP88 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,0,0,0};
        int m=4;
        int[] arr2={1,2,3};
        int n=3;
        for(int i=0;i<n;i++){
            arr1[m+i]=arr2[i];
        }
        Arrays.sort(arr1);
        for(int x:arr1){
            System.out.println(x);
        }
    }
}
