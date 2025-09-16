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
    void deleteAlt(){
        node temp=head;
       if (head == null || head.next == null) {
        return;
    }
        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        
    }
}       
    

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner z=new Scanner(System.in);
        linkedlist lst=new linkedlist();
        while(z.hasNextInt()){
            int n=z.nextInt();
            lst.insert(n);
        }
        
        lst.deleteAlt();
        lst.display();
    }
}
