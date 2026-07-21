public class LCP26{
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        System.out.println(index);
             
    }
    
    
}