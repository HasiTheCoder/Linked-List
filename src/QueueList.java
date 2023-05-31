public class QueueList {
    private intLinkedList linkedList;
    public QueueList() {
        linkedList = new intLinkedList();
    }
    public QueueList (int[] Queue) {
        linkedList = new intLinkedList();
        for (int i = 0; i < Queue.length; i++) {
            linkedList.addToBack(Queue[i]);
        }
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void enqueue(int i) {
        linkedList.addToBack(i);
    }

    public int dequeue() {
        return linkedList.removeFirstItem();
    }
    public int size() {
        return linkedList.size();
    }

    public String front() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        return "" + linkedList.getHead();
    }

    public void makeEmpty() {
        linkedList.makeEmpty();
    }
    public String toString() {
        return linkedList.toString();
    }
}
