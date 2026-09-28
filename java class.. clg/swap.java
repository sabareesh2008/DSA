public class swap{
    public static void main(String[] args){
        int a=12345678;
        int b = a%10;
        a/=10;
        int c = a%10;
        a/=10;
        int d = a%10;
        a/=10;
        int e = a%10;
        a/=10;
        int f = a%10;
        a/=10;
        int g = a%10;
        a/=10;
        int h = a%10;//abcdefghi
        a/=10;
        int i = a%10;
        int res=(h*10000000)+(i*1000000)+(f*100000)+(g*10000)+(d*1000)+(e*100)+(b*10)+c;
        System.out.println(res);

    }
}