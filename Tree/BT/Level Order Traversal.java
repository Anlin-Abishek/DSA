void levelOrderTraversal(Node root) {

if (root == null) {
            return;
        }
 Queue<Node> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty()) {
  Node n = q.remove();
  System.out.print(n.data + " ");
  if (n.left != null) {
                q.add(n.left);
            }
  if (n.right != null) {
                q.add(n.right);
            }
        }
    }
