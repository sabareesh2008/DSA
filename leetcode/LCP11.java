public class LCP11 {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
       
        int l=0;
        int r=arr.length-1;
        int max=0;
        while(l<r){
           int w=r-l;
            int h=Math.min(arr[l],arr[r]);
             max=Math.max(max,w*h);
            if(arr[l]<arr[h]) l++;
            else r--;
        }
        System.out.println(max);

    }

}
