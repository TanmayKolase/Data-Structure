// class find Minimum and Maximum value from the BinarySearchTree

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

public class findMinMax {
    Node root;

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

    static int findMin(Node root) {
        if (root == null) {
            return -1;
        }

        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }

    static int findMax(Node root) {
        if (root == null) {
            return -1;
        }

        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.data;
    }

    public static void main(String[] args) {
        findMinMax tree = new findMinMax();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Minimum element: " + findMin(tree.root));
        System.out.println("Maximum element: " + findMax(tree.root));
    }

}
