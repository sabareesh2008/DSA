public class LCP53 {
    public static void main(String[] args) {
        int[] arr={-2,3,-4};
        int cur=arr[0];
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=cur;
                cur=min;
                min=temp;
            }
            cur = Math.max(arr[i],cur*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            max=Math.max(cur,max);
        }
        System.out.println(max);
    }
}
