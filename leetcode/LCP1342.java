public class LCP1342{
    public static void main(String[] args) {
        int num=14;
        int count=0;
        while(num!=0){
            if(num%2==0){
                count++;
                num/=2;
            }
            else{
                num-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
