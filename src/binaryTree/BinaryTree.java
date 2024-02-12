package binaryTree;

import java.util.*;

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
            }else queue.add(t.left);
            if(t.right == null){
                t.right = new Node(val);
                break;
            }else queue.add(t.right);
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

    public boolean find(Node root , int key){
        if(root == null) return false;
        if(root.val == key) return true;
        if(find(root.left , key)) return true;
        if(find(root.right , key)) return true;
        return false;
    }

    public int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public int findMin(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val , Math.min(findMin(root.left) , findMin(root.right)));
    }

    public int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(findMax(root.left) , findMax(root.right)));
    }

    public int maxSum(Node root){
        if(root == null) return 0;
        return root.val + Math.max(maxSum(root.left) , maxSum(root.right));
    }

    public ArrayList<Integer> leftMostView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        helperForLeft(root , res , 0);
        return res;
    }
    void helperForLeft(Node root , ArrayList<Integer> res , int level){
        if(root == null) return;
        if(level == res.size()){
            res.add(root.val);
        }
        helperForLeft(root.left , res , level + 1);
        helperForLeft(root.right , res , level + 1);
    }

    public ArrayList<Integer> rightMostView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        helperForRight(root , res , 0);
        return res;
    }

    private void helperForRight(Node root, ArrayList<Integer> res, int level) {
        if(root == null) return;
        if(level == res.size()){
            res.add(root.val);
        }
        helperForRight(root.right , res , level + 1);
        helperForRight(root.left , res , level + 1);
    }

    public LinkedHashSet<Integer> getLeafNodes(Node root){
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        getLeafHelper(root , res);
        return res;
    }

    private void getLeafHelper(Node root, LinkedHashSet<Integer> res) {
        if(root == null) return;
        if(root.left == null && root.right == null) res.add(root.val);
        getLeafHelper(root.left , res);
        getLeafHelper(root.right , res);

    }

    public Node lca(Node root , int a , int b){
        if(root == null) return null;
        if(root.val == a || root.val == b) return root;
        Node left = lca(root.left , a , b);
        Node right = lca(root.right , a , b);
        if(left == null) return right;
        else if (right == null) return left;
        else return root;
    }

    public boolean path(Node root , ArrayList<Integer> al , int des){
        if(root == null) return false;
        al.add(root.val);
        if(root.val == des) return true;
        if(path(root.left , al , des)) return true;
        if(path(root.right , al , des)) return true;
        al.removeLast();
        return false;
    }
}
