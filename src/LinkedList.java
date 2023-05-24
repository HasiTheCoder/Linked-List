public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    private class Node {
        private String data;
        private Node next;
        private Node(String dataN) {
            data = dataN;
        }
        private String getData() {
            return data;
        }
        private Node getNext() {
            return next;
        }
        private void setNext(Node n) {
            next = n;
        }
    }
    public void addToFront(String data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }
    public void remove(String data) {
        if (data.equals(head.getData())) {
            head = head.next;
        }
        else if (isLastNode(data)) {

        }
    }
    public Node getLastNode()
    public boolean isLastNode(String data) {
        Node checkNode = head;
        while (!((checkNode.getData()).equals(data))) {
            if ()
        }
        return checkNode.next == null;
    }
    public int size() {

    }
    public void makeEmpty() {

    }
    /**
     * See all node data
     * @return
     */
    public String toString() {

    }
}
