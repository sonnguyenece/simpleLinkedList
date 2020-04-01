public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);

        ll.add(0, 11);
        ll.add(0, 12);
        ll.add(0, 13);
        ll.add(4, 8);
        ll.add(4, 9);
        ll.add(ll.getSize(), 7);
        ll.add(ll.getSize(), 6);
        ll.remove(3);
        ll.remove(ll.getSize()-1);
        ll.remove(0);
        ll.removeFirst();
        ll.printList();
        System.out.println("size : " + ll.getSize());
    }
}
