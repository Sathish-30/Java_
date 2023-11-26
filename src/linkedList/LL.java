package linkedList;

public class LL {
    private Node head; 
    private Node tail;

    private int size;

    public LL(int size){
        this.size = size;
    }

    public LL(){}

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
        }else{
            Node node = new Node(value);
            tail.next = node;
            tail = node;
        }
        size +=1;
    }



    public void insertAtPosition(int index , int value){
        if(index == 0){
            insertFirst(value);
        }else if(index == size){
            insertLast(value);
        }else{
            Node temp = head;
            for(int i = 1 ; i < index ; i++){
                temp = temp.next;
            }
            temp.next = new Node(value, temp.next);
            size += 1;
        }
    }

    public void printElements(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
        }else{
            System.out.println("The value deleted is : " + head.value);
            head = head.next;
            tail = head;
        }

    }

    public void deleteAtPosition(int index){
        if(head == null){
            System.out.println("Linked list is empty");
        }else{
            Node temp = head;
            for(int i = 1 ; i < index - 1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value , Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
