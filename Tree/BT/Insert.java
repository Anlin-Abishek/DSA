
 Node insert(Node root, int newData) {
        Node newNode = new Node(newData);
        if (root == null) {
            return newNode;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp.left == null) {
                temp.left = newNode;
                return root;
            }
          else {
                queue.add(temp.left);
            }
          if (temp.right == null) {
                temp.right = newNode;
                return root;
          }
          else{
            queue.add(temp.right);
          }
          }
        return root;
    }
