public class rowsum{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{8,9,10}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }

        for(int i=0;i<arr[0].length;i++){
            sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }
    }
}