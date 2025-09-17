import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class CircularSLL {
    Node head = null, tail = null;

    // Insert at end
    void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
            tail.next = head;  // circle back to head
        } else {
            tail.next = nn;    // old tail → new
            tail = nn;         // move tail
            tail.next = head;  // new tail → head
        }
    }

    // Display (one round only) using while
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (true) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (temp == head) break; // stop after full circle
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        CircularSLL l = new CircularSLL();  // create circular list
        while (z.hasNextInt()) {           // keep reading numbers
            l.insert(z.nextInt());         // insert at end
        }
        l.display();                       // show result
    }
}
