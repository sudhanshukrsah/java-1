import java.util.Stack;
public class QueueUsingTwoStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x) {
        s1.push(x);
    }
    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        if (s2.isEmpty()) throw new RuntimeException("Queue is empty");
        return s2.pop();
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue()); // 1
        q.enqueue(4);
        System.out.println(q.dequeue()); // 2
        System.out.println(q.dequeue()); // 3
        System.out.println(q.dequeue()); // 4
    }
}
