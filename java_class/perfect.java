public class perfect{
    public static void main(String[] args) {
        int sum=0;
        int n=28;
        int c=n/2;
        for(int i=1;i<=c;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(n==sum) System.out.println("the perfect number:");
        else System.out.println("not a  perfect number:");
    }
}