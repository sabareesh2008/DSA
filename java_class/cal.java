import java.util.*;
public class cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=1,T=2,W=3,TH=4,F=5,S=6,SU=7;
        int first=S;
        int date = sc.nextInt();
        int day=(date+(first-1))%7;
        if(date<32 && date>0){
            
            if(day==1) System.out.println("Monday");
            else if(day==2) System.out.println("Tuesday");
            else if(day==3) System.out.println("Wednesday");
            else if(day==4) System.out.println("Thursday");
            else if(day==5) System.out.println("Firday");
            else if(day==6) System.out.println("Saturday");
            else  System.out.println("Sunday");
        }
        else System.out.println("invalid day and date");

    }
}
