class rev{
    public static void main(String[] args){
        int num=123;
        int rev=0;
        for(int i=0;num!=0;i++){
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
       }
        System.out.println(rev);

    }
}