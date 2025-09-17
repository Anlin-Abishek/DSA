class node {
    int data;
    node next, prev;

    node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
  class CircularDLL {
    node head = null, tail = null;
     
   void insert(int data){
       
     node n=new node(data);
       if(head==null){
           head=n;
           tail=n;
           head.next=head;
           head.prev=head;
       }
       else{
           tail.next=n;
           n.prev=tail;
           n.next=head;
           head.prev=n;
           tail=n;
          
          
 }
       }
     
     void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node temp = head;
        while (true) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (temp == head) break;
     
     
     
   }
     }
 }
