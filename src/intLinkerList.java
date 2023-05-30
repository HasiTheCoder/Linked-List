public class intLinkerList {
    private Node head;
    public intLinkerList() {
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
        private void setData(int dataN) {
            data = dataN;
        }
    }
    public int getHead() {
        return head.getData();
    }
    public void bubbleSort() {
        int size = size()-1;
        Node temp = head;
        boolean swapped = true;
        int i = 0;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < size-i; j++) {
                if (temp.getData() > temp.getNext().getData()){
                    int tempData = temp.getData();
                    temp.setData(temp.getNext().getData());
                    temp.getNext().setData(tempData);
                    swapped = true;
                }
            }
            i++;
        }
    }
    public void selectionSort() {
        int size = size();
        Node temp = head;
        Node smallestNode;
        for (int i = 0; i < size; i++) {
            smallestNode = findMinNode(temp);
            int tempData = temp.getData();
            temp.setData(smallestNode.getData());
            smallestNode.setData(tempData);
            temp = temp.getNext();
        }
    }
    public Node findMinNode(Node startNode) {
        Node smallestNode = head;
        Node temp = startNode;
        while (temp != null) {
            if (temp.getData() > temp.getNext().getData()) {
                smallestNode = temp.getNext();
            }
            temp = temp.getNext();
        }
        return smallestNode;
    }
    public boolean isSortedIncreasing() {
        if (isEmpty()) {
            return false;
        }
        Node current = head.getNext();
        Node previous = head;
        while (current != null) {
            if (previous.getData() < current.getData()) {
                previous = current;
                current = current.getNext();
            }
            else {
                return false;
            }
        }
        return true;
    }
    public int removeFirstItem(){
        if (isEmpty()) {
            return -1212351246;
        }
        else {
            int temp = head.getData();
            head = head.getNext();
            return temp;
        }
    }
    public void removeLastTime() {
        if (isEmpty()) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node current = head.getNext();
        Node beforeCurrent = head;
        while (current.getNext() != null) {
            beforeCurrent = current;
            current = current.getNext();
        }
        beforeCurrent.setNext(null);
    }
    public int sum() {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.getData();
            temp = temp.getNext();
        }
        return sum;
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
