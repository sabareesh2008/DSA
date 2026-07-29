public class LCP202 {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        int temp=0;
       while(num>9){
        sum=0;
        while(num!=0){
            temp=num%10;
            sum+=temp*temp;
            num/=10;
        }
        num=sum;
    }
    if(num==1){
        System.out.println("true");
    }
    else{
        System.out.println("False");
    }

    }
}
