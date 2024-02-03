package binarySearchTree;

public class Implementation {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = {15 , 10 , 2 , 3 , 21 , 25};
        tree.root = tree.insert(tree.root , arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            tree.insert(tree.root , arr[i]);
        }
        tree.infixDisplay(tree.root);
    }
}
