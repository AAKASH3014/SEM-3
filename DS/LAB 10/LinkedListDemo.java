
public class LinkedListDemo {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        System.out.println("Insert at first:");
        list.display();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        System.out.println("Insert at Last:");
        list.display();


        list.insertAtFirst(10);
        list.insertAtOrder();
        list.insertAtLast(20);
        list.insertAtFirst(40);
        System.out.println("Insert at order:");
        list.display();

        list.deleteNode(20);
        System.out.println("Delete node 20:");
        list.display();

        list.deleteNode(10);
        System.out.println("Delete node 10:");
        list.display();

        list.deleteNode(40);
        System.out.println("Delete node 40:");
        list.display();

        list.deleteNode(30);
        System.out.println("Delete node 30:");
        list.display();

        list.deleteNode(50);
        System.out.println("Delete node 50 (which doesn't exist):");
        list.display();
    }

    public Node first = null;

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
    }

    public void insertAtOrder() {
        Node newNode = new Node(50);
        if (first == null || first.info >= newNode.info) {
            newNode.link = first;
            first = newNode;
            return;
        }
        Node current = first;
        while (current.link != null && current.link.info < newNode.info) {
            current = current.link;
        }
        newNode.link = current.link;
        current.link = newNode;
    }

    public void deleteNode(int key) {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = first, prev = null;
        if (temp.info == key) {
            first = temp.link;
            return;
        }
        while (temp != null && temp.info != key) {
            prev = temp;
            temp = temp.link;
        }
        if (temp == null) {
            System.out.println("Node not found");
            return;
        }
        prev.link = temp.link;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        first = newNode;
        first.link = temp;
    }

    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
