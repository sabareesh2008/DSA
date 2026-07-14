class Node{
    int data;
    Node next;
    Node prev;
    //node
    Node(int data){ 
         this.data=data;
         next=null;
         prev=null;
    }
}
class Double{
    Node head=null; //head

    //insert
    void insertbeg(int data){
        Node newNode = new Node(data);
        if(head!=null){
        newNode.next=head;
        head.prev=newNode;
        }
         head = newNode;
    }
    void insertEnd(int data){
        if(head==null){
            insertbeg(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode; 
        newNode.prev=temp;
    }
    void insertIndex(int data,int index){
         if(index<0){
            System.out.println("INvalid");
         }
         Node newNode=new Node(data);
        Node temp=head;
         for(int i=0;i<index-1;i++){
            temp=temp.next;
         }
         temp.next=newNode;
    }
    void delete(int data){
        Node temp=head;
        if(head.data==data){
            head=head.next;
            return;
        }
        while(temp.next!=null && temp.next.data != data){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Invalid to delete");
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    void deletebyIndex(int index){
        Node temp=head;
        if(index<0){
            System.out.println("Invalid");
            return;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void search(int data){
        Node temp=head;
        if(head.data==data){
            System.out.println("Found");
            return;
        }
        
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not found");
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> "); 
            temp=temp.next;
        }
        System.out.println("Nulll");
    }
    public static void main(String[] args) {
        Double list=new Double();
        list.insertbeg(1);
        list.insertbeg(2);
        list.insertbeg(3);
        list.search(1);
        System.out.println("Search: ");
        list.display();

   }
}