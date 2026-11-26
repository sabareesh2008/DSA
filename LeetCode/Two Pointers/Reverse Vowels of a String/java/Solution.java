class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] str=s.toCharArray();
        String vow="aeiouAEIOU";
        while(l<r){
            while(l<r && vow.indexOf(str[l])==-1){
                l++;
            }
            while(l<r && vow.indexOf(str[r])==-1){
                r--;
            }
            char temp=str[l];
            str[l]=str[r];
            str[r]=temp;
            l++;
            r--;
        }
        return new String(str);
    }
}