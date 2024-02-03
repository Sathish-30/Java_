package doublyLinkedList;

public class Implementation {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        // dl.convertArrToLinkedList( new int[]{1 , 2 , 3 , 4 , 5 , 6});
        dl.addFirst(-1);
        dl.addFirst(10);
        dl.addFirst(3);
        dl.addFirst(5);
        dl.addFirst(6);
        dl.addFirst(11);
        dl.deleteFirst();
        dl.deleteFirst();
        dl.deleteLast();
        dl.addlast(21);
        dl.deleteAtK(3);
        dl.printLinkedList(dl.head);
        System.out.println();
        dl.revList();
    }
}
