package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
        root = null;
    }   

    public Node getRoot(){
        return this.root;
    }

    public void insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.peek();
            queue.remove();
            System.out.println(root.val);
            if(root.left == null){
                root.left = new Node(val);
                break;
            }else queue.add(root.left);
            if(root.right == null){
                root.right = new Node(val);
                break;
            }else queue.add(root.right);
        }
    }

    public void levelOrder(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            if(temp.left != null){
                 queue.add(temp.left);
            }
            if(temp.right == null){
                queue.add(temp.right);
            }
        }
    }

}
