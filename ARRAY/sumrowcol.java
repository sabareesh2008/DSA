public class sumrowcol{
    public static boolean rowcol(int[][] arr){
        
        int row1st=0;
        int row=0;
        int col=0;
        for(int i=0;i<arr.length;i++){
            row1st+=arr[i][0];
        }
        for(int i=0;i<arr.length;i++){
            row=0;
            col=0;
            for(int j=0;j<arr[0].length;j++){
                row+=arr[i][j];
                col+=arr[j][i];
            }
            if(row!=row1st && col!=row1st) return false;
        }
       
        return true;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,2},{3,2,1},{2,1,3}};
        System.out.println(rowcol(arr));
    }
}