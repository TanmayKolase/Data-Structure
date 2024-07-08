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

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRecursively(root, key);
    }

    Node insertRecursively(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key)
            root.left = insertRecursively(root.left, key);
        else if (key > root.data)
            root.right = insertRecursively(root.right, key);

        return root;
    }

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

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data > key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("In Order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre Order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post Order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Search for 40 in BST: " + tree.search(40));
        System.out.println("Search for 100 in BST: " + tree.search(100));
    }
}
