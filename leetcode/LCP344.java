class LCP344{
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
       int l=0;
       int r=s.length-1;
       char[] s2=s;
       while(l<=r){
        char temp=s2[l];
        s2[l]=s2[r];
        s2[r]=temp;
        l++;
        r--;
       }
       for(int i=0;i<s.length;i++){
        System.out.println(s2[i]);
       }
    }
}