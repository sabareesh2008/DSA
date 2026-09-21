class Node{
    int expo;
    int coef;
    Node next;
    Node(int coef,int expo){
        this.coef=coef;
        this.expo=expo;
        this.next=next;
    }
}
public class Polynomial_add {
    Node head=null;
    void insertAtBeg(int coef,int expo){
        Node newNode = new Node(coef,expo);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int coef,int expo){
        
        if(head==null){
            insertAtBeg(coef, expo);
            return;
        }
        Node newNode = new Node(coef,expo);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        System.out.println();
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.coef+"x^"+temp.expo+" + ");
            temp=temp.next;
        }
    }
     static Polynomial_add P;
     static void  poly_add(Node p1,Node p2){
            P = new Polynomial_add();
            Node temp1=p1;
            Node temp2=p2;
        while(temp1!=null & temp2!=null){
            if(temp1.expo==temp2.expo){
                P.insertAtEnd(temp1.coef+temp2.coef, temp1.expo);
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(temp1.expo>temp2.expo){
                P.insertAtEnd(temp1.coef,temp1.expo);
                temp1=temp1.next;
            }
            else if(temp2.expo>temp1.expo){
                P.insertAtEnd(temp2.coef,temp2.expo);
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            P.insertAtEnd(temp1.coef,temp1.expo);
            temp1=temp1.next;
        }
        while(temp2!=null){
            P.insertAtEnd(temp2.coef, temp2.expo);
            temp2=temp2.next;
        }
    }
    
    public static void main(String[] args) {
        Polynomial_add p1=new Polynomial_add(); //2x^2 + 6x
        p1.insertAtEnd(2,2 );
        p1.insertAtEnd(6, 1);

        Polynomial_add p2=new Polynomial_add();//8x^2 + 5x + 1
        p2.insertAtEnd(8,2);
        p2.insertAtEnd(5, 1);
        p2.insertAtEnd(1, 0);

        p1.display();
        p2.display();
        System.err.println("");
        System.out.println("Addition");
        poly_add(p1.head,p2.head);
        P.display();
    }
}
