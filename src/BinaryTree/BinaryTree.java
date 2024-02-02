import java.util.*;

public class BinaryTree{
    public Node root;
    public BinaryTree(){
        root = null;
    }

    public void insert(Node root  int val){
        if(root == null){
            root = new Node(val);
            return;
        }

        if(val <= root.val){
            insert(root.left , val);
        }else{
            insert(root.right , val);
        }
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }
}

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(int val){
        this.val = val;
    }
}