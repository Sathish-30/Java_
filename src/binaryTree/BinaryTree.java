package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private final Node root;
    public BinaryTree(){
        root = null;
    }   

    public Node getRoot(){
        return this.root;
    }

    public Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node t = queue.peek();
            queue.remove();
//            System.out.println(t.val);
            if(t.left == null){
                t.left = new Node(val);
                break;
            }else queue.add(root.left);
            if(t.right == null){
                t.right = new Node(val);
                break;
            }else queue.add(root.right);
        }
        return root;
    }

    public void levelOrder(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("Binary Tree Level order Traversal : ");
        while(!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            System.out.print(temp.val+" -> ");
            if(temp.left != null){
                 queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.print("null");
    }

    public void inorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" -> ");
        inorder(root.left);
        inorder(root.right);
    }

}
