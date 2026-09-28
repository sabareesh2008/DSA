public class LCP2574 {
    public static void main(String[] args) {
        int[] arr={12,1,12};
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                r+=arr[j];
            }
            int res=Math.abs(l-r);
            System.out.println(res);
            b[i]=res;
        }
        
        }
}
