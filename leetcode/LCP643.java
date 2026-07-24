public class LCP643 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=3;
        double sum=0;
        for(int i=0;i<k;i++) sum+=arr[i];
        double avg=sum/k;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            avg=Math.max(avg,sum/k);
        }
        System.out.println(avg);
    }
}
