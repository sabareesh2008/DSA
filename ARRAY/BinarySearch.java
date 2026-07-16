public class BinarySearch {
    public static int find(int[] arr, int target){
        int left=0;
        int right=arr.length;
        boolean asc=true;
        if(arr[left]>arr[right-1]){
            asc=false;
        }
        if(asc){
            while(left<right){
                int mid=(left+right)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        else{
                while(left<right){
                    int mid=(left+right)/2;
                    if(arr[mid]==target){
                        return mid;
                    }
                    else if(arr[mid]>target){
                        left=mid-1;
                    }
                    else{
                        right=mid+1;
                    }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4};
        int target=8;
        System.err.println(find(arr,target));
    }
}
