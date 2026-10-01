import java.util.*;
class username{
    private String username;
    private int password;
    username(String username,int password){
        this.username=username;
        this.password=password;
    }

    boolean check(String user,int pass){
        if(user==username && pass==password){
            return true;
        }
        return false;
    }
    void display(){
        System.out.println(this.username);
    }
}
public class password{
    public static void main(String[] args) {
        username u = new username("sabareesh", 12345);
        u.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the user name : ");
        String user = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter password : ");
        int pass =sc.nextInt();
        System.out.println(u.check(user,pass));
        System.out.println("To change password enter password again");
        int pass2=sc.nextInt();
    }
}