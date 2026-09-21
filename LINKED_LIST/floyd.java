class list{
    int data;
    list next;
    list(int data){
        this.data=data;
        next=null;
    }
    
   
}
class detection{
    list head=null;
     void insertEnd(int data){
        list newlist=new list(data);
        if(head==null){
            newlist.next=head;
            head=newlist;
            return;
        }
        list temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newlist;
    }
    void display(){
        list temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    boolean cycle(){
        list slow=head;
        list fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(slow==fast) return true;
        }
        
        return false;
    }
}
public class floyd{
    public static void main(String[] args) {
        detection list=new detection();
    
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
       
        list.display();
        System.out.println(list.cycle());
    }
}