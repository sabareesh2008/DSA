class LCP75{
    public static void main(String[] args) {
        int[] arr={0,1,0,1,2,1,2,0};
        int l=0;
        int r=arr.length-1;
        int m=0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else{
                int temp=arr[m];
                arr[m]=arr[r];
                arr[r]=temp;
                r--;
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}