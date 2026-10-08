public class GCD{
    public static int gcd(int a,int b) {
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int s=12;
        int e=18;
        int fd=gcd(s,e);
        System.out.println(fd);
    }
 }