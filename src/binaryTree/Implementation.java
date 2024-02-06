package binaryTree;

import binaryTree.BinaryTree;
public class Implementation {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.getRoot();
        bt.insert(root, 11);
        bt.insert(root, 25);
        bt.insert(root, 15);
        bt.insert(root, 13);
        bt.insert(root, 20);
        bt.levelOrder(root);
    }
}
