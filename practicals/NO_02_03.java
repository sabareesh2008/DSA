
class List{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void inserAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;        
    
    }
    void inserAtPosition(int data,int pos){
        Node newNode=new Node(data);
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid postion");
            return ;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void deleteAtBeginning(){
        head=head.next;
    }
    void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void deleteAtPosition(int pos){
        if(pos==1){
             head=head.next;
             return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
public class NO_02_03{
    public static void main(String[] args) {
        List list=new List();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.inserAtEnd(30);
        list.inserAtEnd(40);
        list.insertAtBeginning(50);
        list.inserAtPosition(45, 3);
        list.display();
        System.out.println();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(2);
        list.display();

    }
}
