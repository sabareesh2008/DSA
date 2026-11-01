class parent{
    static void display(){
        System.out.println("Hi, helloo");
    }
}
class child extends parent{
    static void display(){
        System.out.println("Hi, How are you ?");
    }
}
public class sta{
    public static void main(String[] args) {
        child ch = new child();
        ch.display();
    }
}
