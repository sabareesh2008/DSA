public class LCP2461{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=3;
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum=maxSum+arr[i];
        }
        int sum=maxSum;
        System.out.println(maxSum);
        for(int i=k;i<arr.length;i++){
            maxSum+=arr[i] - arr[i-k];
            sum = Math.max(maxSum,sum);
        }
        System.out.println(sum);
    }
}