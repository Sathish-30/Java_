package binarySearchTree;

public class BinarySearchTree {
    public Node root;
    public BinarySearchTree(){
        root = null;
    }

    public Node insert(Node node , int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val <= node.val){
            node.left = insert(node.left , val);
        }else{
            node.right = insert(node.right , val);
        }
        return node;
    }

    public void prefixDisplay(Node root){
        if(root == null) return;
        System.out.println(root.val);
        prefixDisplay(root.left);
        prefixDisplay(root.right);
    }
    public void infixDisplay(Node root){
        if(root == null) return;
        prefixDisplay(root.left);
        System.out.println(root.val);
        prefixDisplay(root.right);
    }

    public void postDisplay(Node root){
        if(root == null) return;
        prefixDisplay(root.left);
        prefixDisplay(root.right);
        System.out.println(root.val);
    }
}
