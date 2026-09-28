
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c;
        System.out.println("Before Swap");
        System.out.println("A = "+a);;
        System.out.println("B = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap");
        System.err.println("A = "+a);
        System.out.println("B = "+b  );
    }
    
}
