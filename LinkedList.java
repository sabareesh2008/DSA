

class Node{
    int data;
    Node next;
    //node
    Node(int data){ 
         this.data=data;
         next=null;
    }
}
class LinkedList{
    Node head=null; //head

    //insert
    void insertbeg(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }

    void insertEnd(int data){
        if(head==null){
            insertbeg(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }
    //insert at index 
    void insertIndex(int index,int data){
        if(index<0){
            System.out.println("Invalid index");
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //delete 
    void delete(int data){
        Node temp=head;
        if(head.data==data){
            head=head.next;
            return;
        }
        while(temp.next!=null && temp.next.data!=data){
           temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Invalid index");
        }
        temp.next=temp.next.next;  
    }

    // delete by index 
    void deleteIndex(int index){
        Node temp=head;
         if(index<0){
            System.out.println("Invalid index");
            return;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    void search(int data){
        Node temp=head;
        int count =0;
        if(head.data==data){
            System.out.println("Found");
            System.out.println("Found at index : "+count);
            return;
        }
        while(temp!=null){
            count++;
            if(temp.data == data){
                
                System.out.println("Found at index : "+count);
                return;
            }
            temp=temp.next;
        }
        System.err.println("Not Found");
    } 
    // reverse
    void reverse(){
        Node prev = null;
        Node current = head;
        Node next=null;
        while(current!=null){
            next = current.next;
            current.next=prev; // reversing
            prev=current;
            current=next;
        }
        head = prev;
    }
    //display
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> "); 
            temp=temp.next;
        }
        System.out.println("Nulll");
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertbeg(1);
        list.insertbeg(2);
        list.insertbeg(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(20);
        list.insertEnd(15);
        list.insertEnd(12);
        list.insertIndex(2, 10);
       
        
        list.display();
        System.err.println("Search");
        list.search(3);

        list.reverse();
        list.display();
    }
}