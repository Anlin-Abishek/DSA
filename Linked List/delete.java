class node{
    int data;
    node next;
    node(int d){
        data=d;
        next=null;
    }
}
class linkedlist{
    node head=null;
    node old=null;
    void insert(int data){
        node n=new node(data);
        if(head==null){
            head=n;
            old=n;
        }
    else{
        old.next=n;
        old=n;
        
    }
    }
    
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
public void delete(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        else{
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                if(temp.data==data){
                    prev.next=temp.next;
                }
                prev=temp;
                temp=temp.next;
            }
        }
}
public class Main {
    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        linkedlist lst=new linkedlist();
        while(z.hasNextInt()){
            int n=z.nextInt();
            lst.insert(n);
        }
      //enter the number to deleted from the list
      int a=z.nextInt();
        lst.display();
      lst.delete(15);
    }
}
