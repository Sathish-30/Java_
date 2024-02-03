package doublyLinkedList;
public class DoublyLinkedList {
    Node head ;
    Node prev;

    public void convertArrToLinkedList(int[] arr){
        head = new Node(arr[0]);
        prev = head;
        int len = arr.length;
        for(int i = 1 ; i < len ; i++){
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp;
        }
        printLinkedList(head);
    }

    public void revList(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node head1 = new Node(temp.val);
        Node pre = head1;
        while(temp.prev != null){
            temp = temp.prev;
            Node newNode = new Node(temp.val ,null , pre);
            pre.next = newNode;
            pre = newNode;
        }
        printLinkedList(head1);
    }


    public void deleteFirst(){
        if(head == null || head.next == null){
            head = null;
        }else{
            Node pre = head;
            head = pre.next;
            head.prev = null;
            pre.next = null;
        }
    }

    public void deleteAtK(int k) {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            if (c == k) {
                break;
            }
            temp = temp.next;
        }
        Node pre = temp.prev;
        Node post = temp.next;
        if (pre == null && post == null) {
            head = null;
        } else if (pre == null) {
            deleteFirst();
        } else if (post == null) {
            deleteLast();
        } else {
            pre.next = post;
            post.prev = pre;
        }
    }


    public void deleteLast(){
        if(head == null || head.next == null) {
            head = null;
        }else{
            Node temp = head;
            while(temp.next != null){
                // System.out.println(temp.val);
                temp = temp.next;
            }
            Node t = temp.prev;
            t.next = null;
            temp.prev = null;
        }
    }


    public void addFirst(int val){
        if(head == null) {
            head = new Node(val, null, null);
        }else{
            Node newNode = new Node(val , head , null);
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addlast(int val){
        if(head == null) {
            // If list is empty
            addFirst(val);
        }else{
            Node temp = head;
            Node newNode = new Node(val);
            while(temp.next != null){
                // System.out.println(temp.val);
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void printLinkedList(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
    private static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        public Node(int val , Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
