public class LCP69{
    public static void main(String[] args){
        int x=8;
        double l=1;
        double r=x/2;
        double answer=0;
        while(l<r){
            double mid=l+(r-l)/2;
            double sq=mid*mid;
            if(sq==x){
                System.out.println((int)mid);
                return;
            }
            else if(sq<x){
                answer=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println((int)answer);
    }
}