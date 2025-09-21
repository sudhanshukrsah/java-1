class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
public class CustomLinkedList {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    void delete(int data) {
        if (head == null) return;
        if (head.data == data) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insert(1); list.insert(2); list.insert(3); list.display();
        list.delete(2); list.display();
        list.insert(4); list.display();
    }
}
