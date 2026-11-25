public class palArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                System.out.println("not a palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Its is palindrome");
    }
}
