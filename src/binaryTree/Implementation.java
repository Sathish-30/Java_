package binaryTree;


public class Implementation {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.getRoot();
        root = bt.insert(root , 10);
        root = bt.insert(root , 12);
        root = bt.insert(root , 14);
        root = bt.insert(root , 24);
        root = bt.insert(root , 35);
        root = bt.insert(root , 50);
        bt.levelOrder(root);
        System.out.println();
        System.out.print("InOrder traversal of binary tree : ");
        bt.inorder(root);
        System.out.print("null");
    }
}
