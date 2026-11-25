public class palindrome {
    public static void main(String[] args) {
        int n=959;
        int temp=n;
        int rev=0;
        int digit=0;
    while(temp>0){
        digit=temp%10;
        rev=(rev*10)+digit;
        temp=temp/10;
    }
    if(rev==n){
        System.out.println("the plindrome number is:"+rev);
    }
    else{
        System.out.println("not a palindrome number");
}
    }
    
}
