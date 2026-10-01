
import java.util.Scanner;
public class marks{
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);
        System.out.println("Enter you 5 subject marks : ");
        int mark1=mark.nextInt();
        int mark2=mark.nextInt();
        int mark3=mark.nextInt();
        int mark4=mark.nextInt();
        int mark5=mark.nextInt();
        int tot = mark1+mark2+mark3+mark4+mark5;
        float avg=(float)tot/5;
        System.out.println("Total : "+tot);
        System.out.println("AVerage :  "+avg);
        mark.close();
    }

}