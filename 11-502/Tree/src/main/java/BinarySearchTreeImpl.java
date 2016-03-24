
public class BinarySearchTreeImpl implements BinarySearchTree {

    private  Node root;

    private Node insertNode(Node root, int element)
    {
        if (root == null) {
            root = new Node(element);
            /*
            root.setLeft(null);
            root.setRight(null);
            */
        } else if (element <= root.getData()) {
            root.setLeft(insertNode(root.getLeft(), element));
        } else {
            root.setRight(insertNode(root.getRight(), element));
        }

        return root;
    }

    private void showRec(Node root, int level) {
        if (root != null) {
            showRec(root.getRight(), level + 1);

            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }

            System.out.println(root.getData());

            showRec(root.getLeft(), level + 1);
        }
    }

    public void insert(int element) {
        this.root = insertNode(this.root, element);
    }

    public void show() {
        showRec(root, 0);
    }

    private void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    public void inOrderPrint() {
        inOrder(this.root);
    }
}
