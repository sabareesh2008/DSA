public class LCP239{
    public static void main(String[] args){
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int maxSum=0;
        int[] arr1=new int[arr.length-k+1];
        for(int i=0;i<k;i++){
            maxSum=maxSum+arr[i];
        }
        arr1[0]=maxSum;

       
        

        for(int i=k;i<arr.length;i++){
            maxSum+=arr[i] - arr[i-k];
            arr1[i-k+1]=maxSum;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }


}