class LIST{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void insertion(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }
    void deletion(){
        head=head.next;
    }
    void search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                 System.out.println("Element found");
                 return ;
            }
            temp=temp.next;
        }
        System.out.println("Not found");
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
public class NO_01 {
    public static void main(String[] args) {
        LIST list=new LIST();
        list.insertion(10);
        list.insertion(20);
        list.insertion(30);
        list.insertion(40);
        list.search(30);
        list.deletion();
        list.display();

    }
}
