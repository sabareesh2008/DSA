
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three didgit number ");
        int a=sc.nextInt();
        int first=a%10;
        int second = (a/10)%10;
        int third=(a/100)%10;
        int rev = (first*100) + (second*10) +(third*1);
        System.out.println("reverse : "+rev);
    }
}
