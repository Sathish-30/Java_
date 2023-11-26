package linkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        list.insertFirst(5);
        list.deleteFirst();
        list.deleteAtPosition(2);
        list.insertAtPosition(2,15);
        list.printElements();
    }
}
