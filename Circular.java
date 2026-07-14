public class Circular <T> {
    class Node{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    Node tail=null;
    void insertStart(T data){
        Node newNode= new Node(data);
        if(tail==null){
            tail=newNode;
            newNode.next=newNode;
        }
        else{
            newNode.next=tail.next;
            tail.next=newNode;
        }

    }
    void insertEnd(T data){
        Node newNode= new Node(data);
        if(tail==null){
            tail=newNode;
            newNode.next=newNode;
        }
        else{
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }

    }
    void deleteAtfirst(){  
        if(tail==null){
           System.out.println("Empty List");
           return;
        }
        if(tail.next==tail){
            tail=null;
            return;
        }
        else{
            tail.next=tail.next.next;
        }

    }
    void deleteAtEnd(){
        if(tail==null){
           System.out.println("Empty List");
           return;
        }
        if(tail.next==tail){
            tail=null;
            return;
        }
        else{
            Node temp=tail;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=tail.next;
            tail=temp;
        }
    }
    void display(){
        Node temp=tail;
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp!=tail);
    }
    public static void main(String[] args){
        Circular<Integer> list=new Circular<>();
        list.insertStart(1);
        list.insertStart(12);
        list.insertStart(10);
        list.insertEnd(23);
        list.insertEnd(12);
        list.deleteAtfirst();
        list.deleteAtEnd();
        list.display();
        Circular<String> list1=new Circular<>();
        list1.insertStart("sabareesh");
        list1.display();

    }
}
