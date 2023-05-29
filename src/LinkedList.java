public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    private class Node {
        private int data;
        private Node next;
        private Node(int dataN) {
            data = dataN;
        }
        private int getData() {
            return data;
        }
        private Node getNext() {
            return next;
        }
        private void setNext(Node n) {
            next = n;
        }
    }
    public void sum() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.getData();
        }
    }
    public void removeFirstItem() {
        head = head.getNext();
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void removeLastItem() {
        if (isEmpty()) {
            return;
        }
        Node current = head.getNext();
        Node previous = head;
        while (current != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(current);
    }
    public void addToBack(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.getNext()!=null) {
                temp = temp.getNext();
            }
            temp.next = newNode;
        }
    }
    public void addToFront(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node newNode = new Node(data);
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void remove(int data) {
        if (head == null) {
            return; // List is empty, nothing to remove
        }

        if (data == head.getData()) {
            head = head.getNext();
            return; // Found and removed the node from the head
        }

        Node previous = head;
        Node current = head.getNext();

        while (current != null) {
            if (data == current.getData()) {
                previous.setNext(current.getNext());
                return; // Found and removed the node
            }

            previous = current;
            current = current.getNext();
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        return size;
    }
    public void makeEmpty() {
        head = null;
    }
    /**
     * See all node data
     * @return
     */
    public String toString() {
        Node temp = head;
        String list = "";
        while (temp != null) {
            list += temp.getData() + " ";
            temp = temp.getNext();
        }
        return list;
    }
}
