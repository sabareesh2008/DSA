class node{
    node next;
    int data;
    node(int data){
        this.data=data;
        next=null;
    }
}
public class dsa{
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static boolean cycle(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }

    static node merge(node a,node b){
        node c= new node(0);
        node t=c;
        while(a!=null && b!=null){
            if(a.data<b.data){
                t.next=a;
                a=a.next;
            }
            else{
                t.next=b;
                b=b.next;
            }
            t=t.next;
        }
        if(a!=null) t.next=a;
        if(b!=null) t.next=b;
        return c.next;
    }
    static node rev(node head){
        node prev=null;
        node cur=head;
        node y=null;
        while(cur!=null){
            y=cur.next;
            cur.next=prev;
            prev=cur;
            cur=y;
        }
        return prev;
    }
    public static void main(String[] args) {
        node head= new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
     
        
       

        node head2=new node(25);
        head2.next = new node(32);
        head2.next.next=new node(47);
       
        /* 
        display(head2);
        display(head);
        display(y);*/
       
        node rev=rev(head);
        display(rev);

    }
}
