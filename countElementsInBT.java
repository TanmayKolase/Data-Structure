//Count number of elements present in binary tree.

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class countElementsInBT {
    Node root;
    
    int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        countElementsInBT tree = new countElementsInBT();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        int count = tree.countNodes(tree.root);
        System.out.println("The number of nodes in the binary tree is: " + count);
    }
}

