public class LCP209{
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int k=7;
        int l=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>=k){
                min=Math.min(min,r-l+1);
                sum-=arr[l];
                l++;
            }
            
        }
        System.out.println(min);
    }
}