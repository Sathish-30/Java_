package binaryTree;


import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Implementation {
    public static void main(String[] args) {
        System.out.println("Hello");
        BinaryTree bt = new BinaryTree();
        Node root = bt.getRoot();
        root = bt.insert(root , 7);
        root = bt.insert(root , 5);
        root = bt.insert(root , 3);
        root = bt.insert(root , 12);
        root = bt.insert(root , 21);
        root = bt.insert(root , 41);
        root = bt.insert(root , 10);
        root = bt.insert(root , 11);
//        Node lca = bt.lca(root , 12 , 10);
//        ArrayList<Integer> path1 = new ArrayList<>();
//        ArrayList<Integer> path2 = new ArrayList<>();
//        bt.path(lca , path1, 12);
//        bt.path(lca , path2,  10);
//        System.out.println(lca.val);
//        System.out.println(path1.size() + path2.size() - 2);
        bt.levelOrder(root);
        System.out.println();
        System.out.println(bt.getLeafNodes(root));
        System.out.println(bt.rightMostView(root));
        LinkedHashSet<Integer> outerMostElementsInTree = new LinkedHashSet<>();
        outerMostElementsInTree.addAll(bt.leftMostView(root));
        outerMostElementsInTree.addAll(bt.getLeafNodes(root));
        ArrayList<Integer> rightView = bt.rightMostView(root);
        for(int i = rightView.size() - 1 ; i >= 0 ; i--){
            outerMostElementsInTree.add(rightView.get(i));
        }
        System.out.println(outerMostElementsInTree);

    }
}
