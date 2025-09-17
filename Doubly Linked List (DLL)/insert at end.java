class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

class DLL {
    Node head = null;
    Node tail = null;

    void insert_At_End(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            
            nn.prev = tail;
            tail.next = nn; 
            tail = nn;
        }
    }
 void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
