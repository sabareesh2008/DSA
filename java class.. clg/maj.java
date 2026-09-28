import java.util.*;
public class maj {
    public static void main(String[] args) {
       int[] arr={2,2,3,3,2};
       int count=0;
       int can=arr[0];
       for(int x: arr){
        if(count==0) can=x;
        if(x==count) count++;
        else count--;
       }
       System.out.println(can);
    }

}
