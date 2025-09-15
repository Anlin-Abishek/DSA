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
  void dup() {
        HashSet<Integer> seen = new HashSet<>();
        node curr = head;
        node prev = null;

        while (curr != null) {
            if (seen.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }
}
