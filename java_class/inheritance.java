class emp{
    int salary=1;
    void display(){
        System.out.println(salary);
    }
}
class manager extends emp{
    int salary=2;
    void display(){
        System.out.println(salary);
    }
}
public class inheritance{
    public static void main(String[] args) {
        manager m = new manager();
        m.display();
    }
}