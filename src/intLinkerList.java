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
    }
    public void selectionSort() {
        if (head == null || head.getNext() == null) {
            // Empty or single-node list, nothing to sort
            return;
        }

        Node current = head;
        while (current != null) {
            Node minNode = findMinimumNode(current);
            swapNodes(current, minNode);
            current = current.getNext();
        }
    }

    // Helper method to find the minimum node starting from a given node
    private Node findMinimumNode(Node startNode) {
        Node minNode = startNode;
        Node current = startNode.getNext();

        while (current != null) {
            if (current.getData() < minNode.getData()) {
                minNode = current;
            }
            current = current.getNext();
        }

        return minNode;
    }

    // Helper method to swap two nodes in the linked list
    private void swapNodes(Node node1, Node node2) {
        if (node1 == node2) {
            // Nodes are the same, no need to swap
            return;
        }

        // Find the previous nodes for node1 and node2
        Node prevNode1 = null;
        Node prevNode2 = null;
        Node current = head;

        while (current != null) {
            if (current.getNext() == node1) {
                prevNode1 = current;
            } else if (current.getNext() == node2) {
                prevNode2 = current;
            }
            current = current.getNext();
        }

        // Update the previous nodes' next pointers
        if (prevNode1 != null) {
            prevNode1.setNext(node2);
        } else {
            head = node2;
        }

        if (prevNode2 != null) {
            prevNode2.setNext(node1);
        } else {
            head = node1;
        }

        // Swap the next pointers of node1 and node2
        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }
    public void bubbleSort() {
        if (head == null || head.getNext() == null) {
            // Empty or single-node list, nothing to sort
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node previous = null;

            while (current.getNext() != null) {
                if (current.getData() > current.getNext().getData()) {
                    // Swap adjacent nodes
                    Node temp = current.getNext();
                    current.setNext(temp.getNext());
                    temp.setNext(current);

                    if (previous != null) {
                        // Update the previous node's next pointer
                        previous.setNext(temp);
                    } else {
                        // Update the head pointer if the first node was swapped
                        head = temp;
                    }

                    // Update the current node and set swapped flag
                    previous = temp;
                    swapped = true;
                } else {
                    // Move to the next pair of nodes
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);
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
    public void removeFirstItem(){
        if (isEmpty()) {
            return;
        }
        head = head.getNext();
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
