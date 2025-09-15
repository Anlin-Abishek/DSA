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
}
public class Main {
    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        linkedlist lst=new linkedlist();
        while(z.hasNextInt()){
            int n=z.nextInt();
            lst.insert(n);
        }
        lst.display();
    }
}
