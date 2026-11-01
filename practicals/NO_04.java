
class Node{
    Node next,prev;
    int data;
    Node(int data){
        this.data=data;
        next=prev=null;
    }

}
public class NO_04 {
    Node head=null;
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    void insertAtPosition(int pos,int data){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next=head;
            head.prev=newNode;
            newNode=head;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 & temp!=null;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        NO_04 list=new NO_04();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtPosition(2, 60);
        list.display();
    }
}
