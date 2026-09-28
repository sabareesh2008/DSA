public class difsum {
    public static void main(String[] args) {
        int m=6;
        int n=30;
        int sum1=0,sum2=0;
        for(int i=0;i<=n;i++){
            if(i%6==0){
                sum1+=i;
            }
            else sum2+=i;
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
