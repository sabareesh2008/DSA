class StudentNode{
    int regNo;
    String name;
    int mark;
    StudentNode prev,next;
    public StudentNode(int regNo, String name, int mark) {
        this.regNo = regNo;
        this.name = name;
        this.mark = mark;
        prev=null;
        next=null;
    }
}
class StudentManagement{
    StudentNode head;
    void insertbeg(int regNo,String name,int mark){
        StudentNode newStudent = new StudentNode(regNo,name,mark);
        if(head!=null){
        newStudent.next=head;
        head.prev=newStudent;
        }
         head = newStudent;
    }
    void insertend(int regNo,String name,int mark){
        StudentNode newStudent=new StudentNode(regNo, name, mark);
        if(head==null){
            head=newStudent;
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newStudent;
        newStudent.prev=temp;

    }
    void search(int regNo){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.regNo==regNo){
                System.out.println("Found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("NotFound");
    }
    void deletebyregNo(int regNo){
        StudentNode temp=head;
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head.regNo==regNo){
            head=head.next;
            return;
        }
        while(temp.next!=null && temp.next.regNo!=regNo){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("student not found");
        }
        temp.next=temp.next.next;
        if(temp.next!=null){
        temp.next.prev=temp;
        }

    }
    void updatemark(int regNo,int mark){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.regNo==regNo){
                temp.mark=mark;
                return;
            }
            temp=temp.next;
        }
    }
    void asc(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        StudentNode i,j;
        for(i=head;i!=null;i=i.next){
            for(j=i.next;j!=null;j=j.next){
                if(i.regNo>j.regNo){
                    int regNoTemp=i.regNo;
                    i.regNo=j.regNo;
                    j.regNo=regNoTemp;

                    String nametemp=i.name;
                    i.name=j.name;
                    j.name=nametemp;

                    int markTemp=i.mark;
                    i.mark=j.mark;
                    j.mark=markTemp;

                }
            }
        }

    }
    void rev(){
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("REverse order : ");
        while(temp!=null){
             System.out.println("RegNo : "+temp.regNo+" | Name : "+temp.name+" | Mark : "+temp.mark);
            temp=temp.prev;
        }
    }
    void highestMark(){
        StudentNode temp=head;
        StudentNode high=head;
        while(temp!=null){
            if(temp.mark>high.mark){
                high=temp;
            }
            temp=temp.next;
        }
        System.out.println("Highesht mark student");
          System.out.println("RegNo : "+high.regNo+" | Name : "+high.name+" | Mark : "+high.mark);
    }
    void display(){
        StudentNode temp=head;
        System.out.println("original order");

        while(temp!=null){
            System.out.println("RegNo : "+temp.regNo+" | Name : "+temp.name+" | Mark : "+temp.mark);
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
public class student {
    public static void main(String[] args){
        StudentManagement student = new StudentManagement();
        student.insertbeg(9,"Sabari",100);
       student.insertend(5,"sabareesh",1);
       student.insertend(3,"Vishnu",12);
       student.insertend(1,"Akila",1003);
       student.search(5);
     
       student.display();
    }
}
