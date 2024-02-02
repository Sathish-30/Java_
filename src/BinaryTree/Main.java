import java.util.*;

public class Main{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert( 10);
        tree.insert( 20);
        tree.insert( 20);
        tree.insert(30);
        tree.inOrder();
        
    }
}