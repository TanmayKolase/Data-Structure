class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class PerfectBinaryTree {
    Node root;

    void inOrderTraversal(Node node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.data + "->");
        inOrderTraversal(node.right);
    }

    void preOrderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + "->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void postOrderTraversal(Node node) {
        if (node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + "->");
    }

    public static void main(String[] args) {
        PerfectBinaryTree tree = new PerfectBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("In Order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre Order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post Order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}
