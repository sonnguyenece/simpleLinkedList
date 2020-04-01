public class MyLinkedList {
    private Node head;

//    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        if (index == 0) addFirst(data);
        else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
        }
//        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
//        numNodes++;
    }

    public int getSize() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index) {
        Node temp = head;
        if (index == 0) removeFirst();
        else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next.next;
            temp.next = holder;
        }
    }

    public void removeFirst() {
        Node temp=head;
        head=temp.next;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

//        public Object getData() {
//            return this.data;
//        }
//        public Node get(int index){
//            Node temp=head;
//            for(int i=0; i<index; i++) {
//                temp = temp.next;
//            }
//            return temp;
//        }
    }
}
