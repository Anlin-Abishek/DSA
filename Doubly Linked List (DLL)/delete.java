class node{
    int data;
    node next;
    node prev;
     node(int d){
         data=d;
         next=null;
         prev=null;
     }
}
class DLL{
    node head=null;
    node tail=null;
    void insert(int data){
        node n=new node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
   }

 void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
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
}
