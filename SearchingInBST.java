import java.util.Scanner;

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

public class SearchingInBST {
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

    static boolean isElementFound(int searchElement, Node root) {
        if (root == null) {
            return false;
        }

        if (root.data == searchElement) {
            return true;
        } else if (root.data > searchElement) {
            return isElementFound(searchElement, root.left);
        } else {
            return isElementFound(searchElement, root.right);
        }
    }

    public static void main(String[] args) {
        SearchingInBST tree = new SearchingInBST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter element to search for: ");
        int searchElement = in.nextInt();

        if (isElementFound(searchElement, tree.root)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }

        in.close();
    }
}
