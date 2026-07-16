

public class LinearSearch{
    public static boolean find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return true;
        }        
        return false;
    }
    public static boolean find(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target) return true;
        }
        return false;
    }
    public static boolean find(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9};
        int target=9;
        System.err.println(find(arr,target));
        String str="Sabareesh";
        System.err.println(find(str,'a'));
        int arr1[][]={{1,2,3},{2,3,4},{9}};
        System.out.println((find(arr1,9)));
        }
}