class Queue{
    Node front,rear;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void enqueue(int data){
        Node newNode=new Node(data);
        if(rear==null){
           front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
        System.out.println("Inserted");
    }
    void dequeue(){
        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(front.data+" Dequeued");
        front=front.next;
        if(front==null) rear=null;
    }

    void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return ;
        }
        System.out.println("Queue : ");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("Null");
    }
}

public class queue_using_linkedlist {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        q.enqueue(17);
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
